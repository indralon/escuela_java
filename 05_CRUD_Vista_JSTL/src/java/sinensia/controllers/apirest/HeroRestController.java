/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinensia.controllers.apirest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import sinensia.controllers.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sinensia.model.logic.UserService;
import sinensia.modelo.User;
import sinensia.modelo.persistence.IUserDAO;
import sinensia.modelo.persistence.UserDAO_DerbyDB;

/**
 *
 * @author alumno
 */
@WebServlet(asyncSupported = true, urlPatterns = "/api/heroes")
public class HeroRestController extends HttpServlet {

    public class Hero implements Serializable {

        private int id;
        private String name;
        private String file;

        public Hero() {
        }

        public Hero(int id, String name, String file) {
            this.id = id;
            this.name = name;
            this.file = file;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }

    ArrayList<Hero> listaHeroes;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        listaHeroes = new ArrayList<>();
        listaHeroes.add(new Hero(1, "Ganso man", "../ganso.jpg"));
        listaHeroes.add(new Hero(2, "Spaider man", "../spaider.jpg"));
        listaHeroes.add(new Hero(3, "Buen man", "../bueno.jpg"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        setAccesControlHeaders(resp);
        BufferedReader br
                = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String json = "";
        if (br != null) {
            json = br.readLine();
        }
        Hero hero = new Gson().fromJson(json, Hero.class);
        try {
            listaHeroes.add(hero);
            resp.setContentType("application/json;charset=UTF-8");

            resp.getWriter().print(new Gson().toJson(hero));
        } catch (Exception ex) {
            Logger.getLogger(HeroRestController.class.getName()).log(Level.SEVERE, null, ex);
            resp.getWriter().print("{\"error\":\"" + ex.getMessage() + "\"");

        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        setAccesControlHeaders(resp);
        try {
            Gson gson = new Gson();
            String textJson = gson.toJson(listaHeroes);
            resp.getWriter().print(textJson);

        } catch (Exception ex) {
            Logger.getLogger(HeroRestController.class.getName()).log(Level.SEVERE, null, ex);
            resp.getWriter().print("{\"error\":\"" + ex.getMessage() + "\"");
        }
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setAccesControlHeaders(resp);
        resp.setStatus(HttpServletResponse.SC_OK);
    }

    private void setAccesControlHeaders(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin",
                "http://localhost:4200");
        resp.setHeader("Access-Control-Allow-Methods",
                "OPTIONS,HEAD,GET,POST,PUT,DELETE");
        resp.setHeader("Access-Control-Allow-Headers",
                "X-PINGOTHER,Origin,X-Requested-with,Content-Type,Accept");
        resp.addHeader("Acces-Control-Max-Age", "1728000"); // 20 días
    }
}

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
import java.sql.SQLException;
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
@WebServlet(asyncSupported = true, urlPatterns = "/api/users")
public class UsersController extends HttpServlet {

    UserService userSrv;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.

        IUserDAO usersDAO = new UserDAO_DerbyDB();
        this.userSrv = new UserService(usersDAO);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String json = "";
        if (br != null) {
            json = br.readLine();
        }
        User user = new Gson().fromJson(json, User.class);
        try {
            user = userSrv.create(user.getEmail(), user.getPassword(),
                    user.getName(), String.valueOf(user.getAge()));
            resp.setContentType("application/json;charset=UTF-8");
            resp.getWriter().print(new Gson().toJson(user));
        } catch (SQLException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
            resp.getWriter().print("{\"error\":\"" + ex.getMessage() + "\"");

        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        System.out.println("");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");

        try {
            List<User> usersList = userSrv.getAll();
            // serializamos el List en un JSON
            Gson gson = new Gson();
            String textJson = gson.toJson(usersList);
            resp.getWriter().print(textJson);

        } catch (Exception ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
            resp.getWriter().print("{\"error\":\"" + ex.getMessage() + "\"");
        }
    }

}

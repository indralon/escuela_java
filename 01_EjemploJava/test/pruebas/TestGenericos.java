/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestGenericos {

    @Test
    public void metodosGenericos() {
        ArrayList<Integer> listaInt = new ArrayList<>();
        insertDobleGen(listaInt, 10);
        insertDobleGen(listaInt, 15);
        System.out.println("enteros" + listaInt.toString());

        ArrayList<String> listaStr = new ArrayList<>();
        insertDobleGen(listaStr, "Texto 1");
        insertDobleGen(listaStr, "Texto 2");
        System.out.println("Textos: " + listaStr.toString());
        
        Character[] letras = {'a','m','i','g','o'};
        Float[] arrayFloat = {1.1f,2.2f,33.3f};
        
        mostrarLista(letras);
        ArrayList<Float> listaConvertida = arrayToList(arrayFloat);
        
    }

    public static <Tipo> void insertDobleGen(ArrayList<Tipo> lista, Tipo valor) {
        lista.add(valor);
        lista.add(valor);
    }
    
    public static <T> void mostrarLista(T[] array) {
        // System.out.println(lista.toString());
        for(T obj : array) {
            System.out.println(obj.toString());
        }
    }
    
    public static <T> ArrayList<T> arrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        return list;
    }
}

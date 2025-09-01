package Genericos.tp3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Caja<String> cajaDeString = new Caja<>("Pablo");
        System.out.println(cajaDeString);

        Caja<Integer> cajaDeInteger = new Caja<>(488);
        System.out.println(cajaDeInteger);

        List lista = new ArrayList();

        lista.add("String");
        lista.add(6);

        System.out.println(lista);
    }
}
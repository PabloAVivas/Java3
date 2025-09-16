package Genericos.tp4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<String> genericoDeString = new ArrayList<>();
        genericoDeString.add("hola");
        genericoDeString.add("chau");
        imprimirLista(genericoDeString);

        List<Integer> genericoDeInteger = new ArrayList<>();
        genericoDeInteger.add(123);
        genericoDeInteger.add(321);
        imprimirLista(genericoDeInteger);
    }

    public static <T> void imprimirLista(List<T> lista){
        System.out.println(lista);
    }
}
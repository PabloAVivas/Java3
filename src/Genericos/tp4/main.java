package Genericos.tp4;

public class main {
    public static void main(String[] args) {

        Lista<String> genericoDeString = new Lista<>();
        genericoDeString.agregar("hola");
        genericoDeString.agregar("chau");
        genericoDeString.imprimirLista(genericoDeString.lista);

        Lista<Integer> genericoDeInteger = new Lista<>();
        genericoDeInteger.agregar(123);
        genericoDeInteger.agregar(321);
        genericoDeInteger.imprimirLista(genericoDeInteger.lista);
    }
}
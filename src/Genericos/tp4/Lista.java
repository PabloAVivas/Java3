package Genericos.tp4;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
    public List<T> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public void imprimirLista(List<T> lista){
        System.out.println(lista);
    }

    @Override
    public String toString() {
        return "List{" +
                "lista=" + lista +
                '}';
    }
}

package Colecciones.tp3;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        Producto est1 = new Producto("123", "placeholder");
        Producto est2 = new Producto("312", "placeholder");
        Producto est3 = new Producto("J645", "placeholder");
        Producto est4 = new Producto("123", "placeholder");

        HashSet<Producto> pro = new HashSet<>();
        pro.add(est1);
        pro.add(est2);
        pro.add(est3);
        pro.add(est4);

        System.out.println(pro);

    }
}
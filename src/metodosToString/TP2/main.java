package metodosToString.TP2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Pablo", 21,"Programacion");
        Estudiante est2 = new Estudiante("Sebastian", 22,"Programacion 1");
        Estudiante est3 = new Estudiante("Jeremias", 22,"Programacion 2");
        Estudiante est4 = new Estudiante("Tobias", 21,"Programacion 3");

        ArrayList listaE = new ArrayList<>();
        listaE.add(est1);
        listaE.add(est2);
        listaE.add(est3);
        listaE.add(est4);

        System.out.println(listaE);

    }
}
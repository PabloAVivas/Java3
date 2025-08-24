package metodosToString.TP3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Pablo", 21,"Programacion");
        Estudiante est2 = new Estudiante("Sebastian", 22,"Programacion 1");
        Estudiante est3 = new Estudiante("Jeremias", 22,"Programacion 2");
        Estudiante est4 = new Estudiante("Tobias", 21,"Programacion 3");

        Curso cur1 = new Curso("Programacion Java", "Espejo y Chiroli");

        List listaE = new ArrayList<>();
        listaE.add(est1);
        listaE.add(est2);
        listaE.add(est3);
        listaE.add(est4);

        cur1.setEstudiante(listaE);


        System.out.println(cur1);

    }
}
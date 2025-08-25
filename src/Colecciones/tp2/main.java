package Colecciones.tp2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Alumno est1 = new Alumno("Pablo", 7.5);
        Alumno est2 = new Alumno("Sebastian", 8.2);
        Alumno est3 = new Alumno("Jeremias", 6.7);
        Alumno est4 = new Alumno("Tobias", 9);

        ArrayList<Alumno> listaA = new ArrayList<>();
        listaA.add(est1);
        listaA.add(est2);
        listaA.add(est3);
        listaA.add(est4);

        for (Alumno alum : listaA) {
            System.out.println(alum);
        }

    }
}
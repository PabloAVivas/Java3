package Metodologia.repasoP1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList> listaDelistas = new ArrayList<>();
        System.out.println("Bienvenido al sistema de relevamiento de arboles");

        System.out.println("Por favor responde a las siguientes preguntas");

        String rep = "";
        do {
            ArrayList<String> listaDeReporte = new ArrayList<>();

            System.out.println("El arbol obstruye algun camino? responda si/no");
            String P1 = sc.nextLine();
            System.out.println("El arbol esta inclinado o a punto de caerse? responda si/no");
            String P2 = sc.nextLine();
            System.out.println("El arbol esta infectado o tiene algun paracito? responda si/no");
            String P3 = sc.nextLine();
            System.out.println("El arbol esta en buenas condiciones? responda si/no");
            String P4 = sc.nextLine();
            System.out.println("El arbol esta por destruir alguna edificacion? responda si/no");
            String P5 = sc.nextLine();
            System.out.println("El arbol obstruye algun camino? responda si/no");
            String P6 = sc.nextLine();

            listaDeReporte.add(P1);
            listaDeReporte.add(P2);
            listaDeReporte.add(P3);
            listaDeReporte.add(P4);
            listaDeReporte.add(P5);
            listaDeReporte.add(P6);

            if (!validarRespuestas(listaDeReporte)){
                System.out.println("No se completaron todas las respuestas de manera correcta");
                rep = "si";
            }else {
                System.out.println("Ingrese la zona del arbol (se ingresa por google maps)");

                System.out.println("¿Quieres agregar algun detalle o nota extra?");
                String extra = sc.nextLine();

                System.out.println("¿Quiere hacer otro reporte?");
                rep = sc.nextLine();
            }


        }while (rep.equalsIgnoreCase("si"));
    }

    public static boolean validarRespuestas(ArrayList<String> respuestas) {
        int rIncorrectas = 0;
        for (String respuesta : respuestas) {
            if (respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("no")) {
                continue;
            } else {
                rIncorrectas = rIncorrectas + 1;
            }
        }
        return rIncorrectas == 0;
    }
}


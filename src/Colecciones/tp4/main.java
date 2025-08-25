package Colecciones.tp4;

import Colecciones.tp4.Curso;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Curso cur1 = new Curso("Programacion 1", "Quiros");
        Curso cur2 = new Curso("Programacion 2", "Rigoni");
        Curso cur3 = new Curso("Programacion 2", "Roco");
        Curso cur4 = new Curso("Programacion 3", "Chiroli");

        HashMap<String, Curso> cursos = new HashMap<>();

        cursos.put("P1", cur1);
        cursos.put("P2", cur2);
        cursos.put("P3", cur3);
        cursos.put("P4", cur4);


        System.out.println("Ingresa el codigo para encontrar el curso:");
        String code = scanner.nextLine();
        Curso recuperacionCurso = cursos.get(code);
        if (recuperacionCurso != null) {
            System.out.println("Curso recuperado" + recuperacionCurso);
        } else {
            System.out.println("No se encontró el curso" );
        }

        System.out.println("Listado de cursos:");
        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            String clave = entrada.getKey();
            Curso curso = entrada.getValue();
            System.out.println("Codigo: " + clave + ", " + curso);
        }
    }
}
package Funcional.tp2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Alumno> alumnos = Arrays.asList(
            new Alumno("Pablo", 7.5, "Programacion 3"),
            new Alumno("Jeremias", 6, "Programacion 3"),
            new Alumno("Sebastian", 8.5, "Programacion 2"),
            new Alumno("Tobias", 7.2, "Programacion 2"),
            new Alumno("Manuel", 7, "Programacion 1"),
            new Alumno("Mateo", 5, "Programacion 1"),
            new Alumno("Bruno", 4, "Programacion 1")
        );

        List<String> alumnosAprobados = alumnos.stream().filter(alumno -> alumno.getNota() >= 7).map(alumno -> alumno.getNombre().toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("Aprobados:");
        alumnosAprobados.forEach(System.out::println);


        double promedio = alumnos.stream().mapToDouble(Alumno::getNota).average().orElse(0);
        System.out.println("Promedio notas: " + promedio);


        Map<String, List<Alumno>> alumnosCurso = alumnos.stream().collect(Collectors.groupingBy(Alumno::getCurso));
        alumnosCurso.forEach((curso, listaAlumnos) -> {
            System.out.println(curso + ":");
            listaAlumnos.forEach(alumno -> System.out.println("  " + alumno));
        });


        List<Double> mejorPro = alumnos.stream().map(Alumno::getNota).sorted(Comparator.reverseOrder()).distinct().limit(3).collect(Collectors.toList());
        System.out.println("Los 3 mejores promedios: ");
        mejorPro.forEach(System.out::println);
    }
}

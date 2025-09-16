package Funcional.tp3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
            new Producto("Pokeball", "Pokeball", 100, 200),
            new Producto("Superball", "Pokeball", 200, 150),
            new Producto("Ultraball", "Pokeball", 300, 100),
            new Producto("Pocion", "Curacion", 100, 200),
            new Producto("Super pocion", "Curacion", 150, 150),
            new Producto("Ultra pocion", "Curacion", 200, 100)
        );

        List<Producto> p100 = productos.stream().filter(producto -> producto.getPrecio() > 100).sorted(Comparator.comparingDouble(Producto::getPrecio).reversed()).collect(Collectors.toList());

        System.out.println("Productos con precio mayor a 100 (ordenados por precio descendente):");
        p100.forEach(System.out::println);


        Map<String, Integer> stockCategoria = productos.stream().collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingInt(Producto::getStock)));

        System.out.println("Stock total por categoría:");
        stockCategoria.forEach((categoria, totalStock) -> System.out.println("Categoría: " + categoria + ", Stock Total: " + totalStock));


        String productosNP = productos.stream().map(producto -> producto.getNombre() + ": $" + producto.getPrecio()).collect(Collectors.joining("; "));

        System.out.println("Productos: " + productosNP);


        double promedioG = productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0);

        System.out.println("Precio promedio general: " + promedioG);

        Map<String, Double> promedioC = productos.stream().collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));

        System.out.println("Precio promedio por categoría:");
        promedioC.forEach((categoria, promedio) -> System.out.println("Categoría: " + categoria + ", Precio Promedio: $" + promedio));
    }
}

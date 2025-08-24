package metodosToString.TP5;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Producto> setProductos = new HashSet<>();

        Producto producto1 = new Producto("001", "Producto A", 10.0);
        Producto producto2 = new Producto("002", "Producto B", 20.0);
        Producto producto3 = new Producto("001", "Producto C", 30.0);


        agregarProducto(setProductos, producto1);
        agregarProducto(setProductos, producto2);
        agregarProducto(setProductos, producto3);

        for (Producto p : setProductos) {
            System.out.println(p);
        }
    }

    private static void agregarProducto(HashSet<Producto> set, Producto producto) {
        if (set.add(producto)) {
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("El producto con código " + producto.getCodigo() + " ya está en el HashSet.");
        }
    }
}
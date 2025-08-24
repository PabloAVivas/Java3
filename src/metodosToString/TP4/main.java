package metodosToString.TP4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto("001", "Producto A", 10.0);
        Producto producto2 = new Producto("002", "Producto B", 20.0);
        Producto producto3 = new Producto("001", "Producto C", 30.0);

        agregarProducto(listaProductos, producto1);
        agregarProducto(listaProductos, producto2);
        agregarProducto(listaProductos, producto3);

        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }
    private static void agregarProducto(List<Producto> lista, Producto producto) {
        if (!lista.contains(producto)) {
            lista.add(producto);
        } else {
            System.out.println("El producto con código " + producto.getCodigo() + " ya está en la lista.");
        }
    }
}
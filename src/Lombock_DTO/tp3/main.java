package Lombock_DTO.tp3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Producto p1 = new Producto("KB122", "Telefono", 12000, "Motorola");
        Producto p2 = new Producto("KB12", "Monitor", 13000, "Samsung");
        Producto p3 = new Producto("KB22", "Heladera", 44000, "Fravega");
        Producto p4 = new Producto("K122", "Microondas", 2000, "Garbarino");

        ProductoDTO pd1 = new ProductoDTO(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoDTO pd2 = new ProductoDTO(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoDTO pd3 = new ProductoDTO(p3.getCodigo(), p3.getNombre(), p3.getPrecio());
        ProductoDTO pd4 = new ProductoDTO(p4.getCodigo(), p4.getNombre(), p4.getPrecio());

        ArrayList<ProductoDTO> productos = new ArrayList<>();
        productos.add(pd1);
        productos.add(pd2);
        productos.add(pd3);
        productos.add(pd4);

        for (ProductoDTO lista : productos){
            System.out.println(lista);
        }

    }
}
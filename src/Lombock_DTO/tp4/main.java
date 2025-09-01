package Lombock_DTO.tp4;



import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Producto p1 = new Producto("KB122", "Telefono", "Motorola", 12000);
        Producto p2 = new Producto("KB12", "Monitor", "Samsung",13000);
        Producto p3 = new Producto("KB22", "Heladera", "Fravega",44000);
        Producto p4 = new Producto("K122", "Microondas", "Garbarino",2000);

        ProductoRecord pd1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord pd2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord pd3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());
        ProductoRecord pd4 = new ProductoRecord(p4.getCodigo(), p4.getNombre(), p4.getPrecio());

        ArrayList<ProductoRecord> productos = new ArrayList<>();
        productos.add(pd1);
        productos.add(pd2);
        productos.add(pd3);
        productos.add(pd4);

        for (ProductoRecord lista : productos){
            System.out.println(lista);
        }

    }
}
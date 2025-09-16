package Funcional.tp3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
}

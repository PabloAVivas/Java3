package Funcional.tp2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;
}

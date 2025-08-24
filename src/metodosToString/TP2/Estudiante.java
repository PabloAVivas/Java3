package metodosToString.TP2;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre= " + getNombre() +
                ", edad= " + getEdad() +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}

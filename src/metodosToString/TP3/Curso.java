package metodosToString.TP3;

import java.util.List;

public class Curso {
    private String curso;
    private String profesor;
    private List Estudiante;

    public Curso() {

    }
    public Curso(String curso, String profesor) {
        this.curso = curso;
        this.profesor = profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(List estudiante) {
        Estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + curso + '\'' +
                ", profesor='" + profesor + '\'' +
                ", cantidad de estudiantes=" + Estudiante.size() +
                '}';
    }
}

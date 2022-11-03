package org.example;

public class Aula extends Sala{
    private String profesorAsignatura;

    public Aula() {
        super();
        this.profesorAsignatura = "asign";
    }

    public Aula(Boolean dimensiones, Boolean aire, String profesorAsignatura) {
        super(dimensiones, aire);
        this.profesorAsignatura = profesorAsignatura;
    }

    public String getProfesorAsignatura() {
        return profesorAsignatura;
    }

    public void setProfesorAsignatura(String profesorAsignatura) {
        this.profesorAsignatura = profesorAsignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "Aula{" +
                "profesorAsignatura='" + profesorAsignatura + '\'' +
                '}';
    }
}

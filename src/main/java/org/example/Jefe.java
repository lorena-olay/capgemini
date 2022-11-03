package org.example;

public class Jefe extends Empleado{
    private String departamento;

    public Jefe(String nombre, String dni, String tlf, String cargo, double sueldo, String departamento) {
        super(nombre, dni, tlf, cargo, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Jefe{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}

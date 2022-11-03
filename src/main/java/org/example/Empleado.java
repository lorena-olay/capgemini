package org.example;

public class Empleado extends Persona{
    private String nombre, dni, tlf, cargo;
    private double sueldo;

    public Empleado() {
        super();
        this.nombre = "ESTHER";
        this.dni = "790473829dni";
        this.tlf = "623432432tlf";
        this.cargo = "junior";
        this.sueldo = 790;
    }

    public Empleado(String nombre, String dni, String tlf, String cargo, double sueldo) {
        super();
        this.nombre = nombre;
        this.dni = dni;
        this.tlf = tlf;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf='" + tlf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

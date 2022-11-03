package org.example;

public class Currito extends Empleado{
    private Boolean disponible;

    public Currito(String nombre, String dni, String tlf, String cargo, double sueldo, Boolean disponible) {
        super(nombre, dni, tlf, cargo, sueldo);
        this.disponible = disponible;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return super.toString() + "Currito{" +
                "disponible=" + disponible +
                '}';
    }
}

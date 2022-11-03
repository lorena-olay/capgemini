package org.example;

public class Sala {
    private Boolean dimensiones, aire;

    public Sala() {
        this.dimensiones = true;
        this.aire = false;
    }

    public Sala(Boolean dimensiones, Boolean aire) {
        this.dimensiones = dimensiones;
        this.aire = aire;
    }

    public Boolean getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Boolean dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getAire() {
        return aire;
    }

    public void setAire(Boolean aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "dimensiones=" + dimensiones +
                ", aire=" + aire +
                '}';
    }
}

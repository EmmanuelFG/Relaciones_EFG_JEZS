package org.emmfogo.composicion;

public class Humano {
    private final Cerebro cerebro;
    private String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
        this.cerebro = new Cerebro(4);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package org.emmfogo.asociacion;

public class Carro {
    public int llantas;
    public int capacidad;
    public int color;

    public Carro (int llantas,int color, int capacidad){
        this.capacidad = capacidad;
        this.color = color;
        this.llantas = llantas;
    }

    public void encender(Persona conductor){
        System.out.println("El carro fue encendido por: " + conductor.nombre );
    }
}

package org.emmfogo.agregacion;

public class Persona {
    private final EstadoCivilEnum estadoCivil;
    private final int edad;
    private final String nombre;

    public Persona(EstadoCivilEnum estadoCivil, int edad, String nombre) {
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.nombre = nombre;
    }

    
}

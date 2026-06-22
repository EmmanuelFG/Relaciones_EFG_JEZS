package org.emmfogo.agregacion;

import org.emmfogo.agregacion.enums.EstadoCivilEnum;

public class Persona {
    private final EstadoCivilEnum estadoCivil;
    private final int edad;
    private final String nombre;

    public Persona(EstadoCivilEnum estadoCivil, int edad, String nombre) {
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }


}

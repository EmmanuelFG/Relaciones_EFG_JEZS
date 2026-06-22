package org.emmfogo.agregacion;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private final String direccion;
    private final String dueno;
    private final List<Mobiliario> muebles;
    private final List<Persona> habitantes;

    public Casa(String direccion, String dueno) {
        this.direccion = direccion;
        this.dueno = dueno;
        this.muebles = new ArrayList<>();
        this.habitantes = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDueno() {
        return dueno;
    }

    public void agregarHabitante(Persona habitante) {
        this.habitantes.add(habitante);
    }

    public void agregarMueble(Mobiliario muebleNuevo) {
        this.muebles.add(muebleNuevo);
    }
}

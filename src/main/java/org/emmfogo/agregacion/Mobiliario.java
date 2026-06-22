package org.emmfogo.agregacion;

import org.emmfogo.agregacion.enums.TipoMuebleEnum;

public class Mobiliario {
    private final TipoMuebleEnum tipo;
    private final String color;
    private final int numeroPatas;

    public Mobiliario(TipoMuebleEnum tipo, String color, int numeroPatas) {
        this.tipo = tipo;
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }
}

package org.emmfogo.composicion;

import java.util.ArrayList;
import java.util.List;

public class Cerebro {
    private final int numeroNeuronas;
    private final List<Neurona> neuronas;
    private final List<Meninge> meninges;

    public Cerebro(int numeroNeuronas) {
        this.numeroNeuronas = numeroNeuronas;
        neuronas = new ArrayList<>();
        meninges = new ArrayList<>();

        Neurona n1 = new Neurona(4);
        Neurona n2 = new Neurona(5);
        Neurona n3 = new Neurona(10);
        neuronas.add(n1);
        neuronas.add(n2);
        neuronas.add(n3);

        Meninge m1 = new Meninge("Duramamdre");
        Meninge m2 = new Meninge("Aracnoides");
        Meninge m3 = new Meninge("Piamadre");
        meninges.add(m1);
        meninges.add(m2);
        meninges.add(m2);
    }
}

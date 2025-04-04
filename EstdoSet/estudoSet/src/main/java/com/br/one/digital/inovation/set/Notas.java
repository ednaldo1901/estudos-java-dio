package com.br.one.digital.inovation.set;

public class Notas {
    public double nota;

    public Notas(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "nota=" + nota +
                '}';
    }
}

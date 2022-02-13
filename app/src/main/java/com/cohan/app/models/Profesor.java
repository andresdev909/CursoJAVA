package com.cohan.app.models;

public class Profesor extends Persona{
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;
}

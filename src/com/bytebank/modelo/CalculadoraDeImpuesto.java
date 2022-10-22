package com.bytebank.modelo;

public class CalculadoraDeImpuesto {

    private double totalImpuesto;

    public void registra(Tributacion tributo) {
        double valor = tributo.getValorImpuesto();
        this.totalImpuesto += valor;
    }

    public double getTotalImpuesto() {
        return totalImpuesto;
    }

}
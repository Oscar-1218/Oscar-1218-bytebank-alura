package com.bytebank.modelo;

public class ControlBonificacion {
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion();
		System.out.println(funcionario.getNombre()+" "+this.suma);
		return this.suma;
	}
}

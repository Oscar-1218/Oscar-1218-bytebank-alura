package com.bytebank.modelo;

public class CuentaCorriente extends Cuenta implements Tributacion {
	
	//CONSTRUCTOR
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero); //Llama al contructor de la clase padre, debe respetar los parametros.
	}
	
	//@Override significa que SOBREESCRIBO METODO de clase padre.
	@Override 
	public void saca(double valor) throws SaldoInsuficienteException {
		double comision =0.02;
		super.saca(valor+comision);
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo +=  valor;
		
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
}

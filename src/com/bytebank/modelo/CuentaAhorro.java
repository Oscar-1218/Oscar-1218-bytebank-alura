package com.bytebank.modelo;

public class CuentaAhorro extends Cuenta implements Tributacion{
	
	//CONSTRUCTOR
	public CuentaAhorro(int agencia, int numero) {
		super(agencia,numero);
	}
	
	@Override
	public void depositar(double valor) {
			this.saldo +=  valor;
	}
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor);
	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}

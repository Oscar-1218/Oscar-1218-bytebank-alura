package com.bytebank.modelo;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException(String mensaje) {
		super(mensaje);
		//System.out.println("No tienes saldo. respuesta desde clase SaldoI nsuficienteE xception");
		
	}
	
}

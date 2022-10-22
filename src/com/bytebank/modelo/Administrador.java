package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	@Override
	public double getBonificacion() {
		return this.getBonificacion()*0.1;
	}
	
	@Override //a la clave la traemos del 'util', por eso no presiso declarar variable en esta Class.
	public void setClave(String clave) {
		this.util.setClave(clave);	
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
			return this.util.iniciarSesion(clave);
	}
	
}

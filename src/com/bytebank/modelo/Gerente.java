package com.bytebank.modelo;

public class Gerente extends Funcionario implements Autenticable {
	
	private String clave;
	
	//SOBREESCRITURA DEL METODO(este metodo es == al de Funcionario)
	@Override
	public double getBonificacion() {
		return 232;//super.getSalario()+super.getSalario()*0.05 ; 
	}
		//return this.salario;
		//this. hace referencia a ¡esta clase! y esta clase No tiene Salario xq la hereda de Funcionario.
		//super. hace referencia a la ¡clase padre!.
	
	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getClave() {
		return clave;
	}
	@Override
	public boolean iniciarSesion(String clave) {
		if(this.clave == clave) {
			return true;
		}else {
			return false; }
	}
	
	
	

}

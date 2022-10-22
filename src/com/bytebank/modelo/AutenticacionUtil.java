package com.bytebank.modelo;
//clase util. Se le llama asi porque No es especifica para algun tipo de clases, sino que ouede ser util para varias.
//al usar Extends en class Cliente, ya No presiso la variable clave y los metodos concretos de 'iniciarSesion' y 'setClave'
public class AutenticacionUtil  {
	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}


	public void setClave(String clave) {
		this.clave = clave;	
	}
	
	
}

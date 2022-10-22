package com.bytebank.modelo;

public class GuardaCuentas {
	
	//Crear un objeto para guardar cuentas. 
	//Permitirnos agregar cuentas con un metodo.
	//CRUD
	//1° declaro un array de cuenta
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;
	
	public void adicionar(Cuenta ca) {
		this.cuenta[indice] = ca;
		indice++;
	}

	public Cuenta obtener(int indice) { 
		return cuenta[indice];
		
	}

}

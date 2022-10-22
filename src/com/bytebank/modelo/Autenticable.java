package com.bytebank.modelo;

public interface Autenticable {
	//la Interface No puede extender de una Clase, Si extender de otra interfaz.
	//Todos los metodos de la interfaz son ABSTRACTOS a excepcion Default. 
	//por buena practica No se escribe la palabra ABSTRACT en interface.
	
	public void setClave(String clave) ; 
	public boolean iniciarSesion(String clave) ; 

}
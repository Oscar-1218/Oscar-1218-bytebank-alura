package com.bytebank.modelo;
public class Cliente implements Autenticable {
	private String nombre;
	private String documento;
	private String telefono;	//cuando es private, la unica manera de acceder es dentro de la misma clase.
	//private String clave;
	private AutenticacionUtil util;
	
	//private Cliente titular = new Cliente(); //Esto se llama COMPOSICION DE OBJETOS(un objeto dentro de otro).1
	public Cliente() { 
		this.util = new AutenticacionUtil(); //Esto se llama COMPOSICION DE OBJETOS.2|| 1 y 2 Son composiciones de obj 
	}
	public String getNombre() { 
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);		
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
	
}

package com.bytebank.modelo;
//funcionario = empleado del banco
public abstract class Funcionario{
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public Funcionario() { //CONSTRUCTOR
		
	}
	
	//Hago al metodo abstracto para que SEA IMPLEMENTADO por las clases hijas.
	public abstract double getBonificacion(); // Método sin cuerpo, no hay implementación.
	
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}

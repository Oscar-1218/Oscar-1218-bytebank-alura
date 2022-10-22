package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionarioNewGerente = new Gerente(); //aqui se queda sin los metodos y atributos de la calse GERENTE
		Gerente gerente = new Gerente(); //SI posee los metodos de la clase gerente.
		funcionarioNewGerente.setNombre("Funcionario Paola Elisabet");
		gerente.setNombre("Gerente Ariel");
		gerente.setClave("123456");
		
		System.out.println("iniciarSesion"+gerente.iniciarSesion("123456")+" getSalario"+funcionarioNewGerente.getSalario());
		
	
		
	}
}

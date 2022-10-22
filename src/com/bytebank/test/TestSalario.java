package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestSalario {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(1600);
		
		//aver
		Prueba pe = new Prueba();
		System.out.println(pe.getSaludar());
		
		System.out.println(gerente.getBonificacion());
	}
}

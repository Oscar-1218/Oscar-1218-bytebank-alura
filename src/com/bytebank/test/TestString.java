package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;

public class TestString {

	public static void main(String[] args) {
		String nombre = "Alura"; //String es un OBJETO.
		//↓↓ es lo mismo que lo de arriba↑↑, esto jamas se utiliza.
		//String nombre = new String("Alura");
		// int, double, char, byte -> son tipo de datos primitivos. Xq son simplemente datos y no objetos.	
		//System.out.println(nombre.toUpperCase());
		//System.out.println(nombre.substring(0, 3));
		nombre = nombre.concat(" el mejor!!");
		char letra = nombre.charAt(2); //retorna la posicion en la tabla ascii o la letra si es char en println.
		int indice = nombre.indexOf("r");//si la letra no existe retorna -1. De nada
		boolean booleano = nombre.isEmpty();
		System.out.println(nombre.replace("l", "L"));
		System.out.println("-----------");
		p(new CuentaAhorro(400, 10003));
		//tambien es valido hacer:
		Object cu = new CuentaAhorro(100, 10005);
		p(letra);
		p(indice);
		p(booleano);
		p(cu.toString());
		/*
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		*/
	}
	/*
	//SOBRECARGA del metodo
	public static void p(boolean valor) {
		System.out.println(valor);
	}
	public static void p(char valor) {
		System.out.println(valor);
	} o tambien se puede hacer asi==*/
	public static void p(Object valor) {
		System.out.println(valor.toString());
	}
	
	
}
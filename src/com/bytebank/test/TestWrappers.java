package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		Double numerodoble = 33.13; //autoboxing
		Boolean boleano = true;	//autoboxing
		String numeroString = "43"; //autoboxing
		Number numerodoble2 = Double.valueOf(33);
		Number numero = Double.valueOf(36);
		//p(numerodoble2);
		double numeroPrimitivo = numero.doubleValue(); // An-boxing
		p(numeroPrimitivo);

		
		
	}
	public static void p(Object ob) {
		System.out.println(ob);
	}
}

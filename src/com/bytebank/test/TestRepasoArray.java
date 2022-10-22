package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {

	public static void main(String[] args) {
		int[] num = new int[10];
		num[0]= 8;
		int numeroint = 3;
		//Integer numeroobjeto = new Integer(10); //DEPRECATED
		Integer numObjeto = Integer.valueOf(5); //↑↑↑ Esto Si es lo correcto 
						/*.valueOf es un metodo estatico, un metodo estatico No se necesta crear una intancia
						 * para poder usarlo. Se lo utilizza desde la clase misma.*/
		List<Integer> lista = new ArrayList<>();
		lista.add(numeroint); //autoBoxing-> hace una conversion de tipo primitivo a tipo objeto.
		lista.add(numObjeto);//↓↓↓ Es lo mismo
		lista.add(Integer.valueOf(11));
		
		
		//unBoxing ↓↓↓
		int numeroInt = numObjeto;
		float numfloat = numObjeto.floatValue();
		byte numbyte = numObjeto.byteValue();
		//p(numObjeto.longValue());
		p(Integer.MAX_VALUE);
		p(Integer.SIZE); //retorna los bits
		p(Integer.BYTES); //retorna los bytes
	
		String diaComoTexto = "29";
		int dia = Integer.parseInt(diaComoTexto);
		
		
	
	}
	static void p (Object ob) {
		System.out.println(ob);
	}

}

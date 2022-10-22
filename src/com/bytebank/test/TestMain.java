package com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*   			  [ | | | | ] ->espacios en memoria heap					*/
	  //int[] edades Ambas formas son correctas.
		int edades[] = new int[5];
		edades[2] = 30;
		//p(edades[2]);
		//p(edades.length);
		for (int i : edades) {
			p(i);
		}
		
		
	}
	
	public static void p(Object obj) {
		System.out.println(obj);
	}

}
package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CuentaCorriente cc = new CuentaCorriente(15,1003);
	CuentaCorriente arrayCuenta[] = new CuentaCorriente[5];
	arrayCuenta[0] = cc;
	arrayCuenta[1] = new CuentaCorriente(11,10002);
	arrayCuenta[2] = new CuentaCorriente(14,10008);
	CuentaCorriente ccn = arrayCuenta[3];
	p(ccn);
	p("------------------");
	p(cc.hashCode());
	p(arrayCuenta[0].hashCode());
	
	int[] refs = {1,2,3,4,5};
	for (int i : refs) {
		p(i);
	}
	
	int[] numeros = new int[6];
	numeros[0] = 1;
	numeros[1] = 2;
	numeros[2] = 3;
	numeros[3] = 4;
	numeros[4] = 5;
	p("------------");
	for (int i : numeros) {
		p(i);
	}
		}
	
	public static void p(Object ob) {
		System.out.println(ob);
	}
}


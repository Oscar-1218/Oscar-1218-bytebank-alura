package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestArregloReferencias2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Cuenta arrayCuenta[] = new Cuenta[5];
		Object[] arrayCuenta = new Object[5];
	arrayCuenta[0] =  new CuentaCorriente(15,1003);
	arrayCuenta[1] = new CuentaCorriente(11,10002);
	arrayCuenta[2] = new CuentaAhorro(10, 100001);
	p(arrayCuenta);
	
	CuentaCorriente cc1 = new CuentaCorriente(22, 33);
	//Cuenta cuenta = cc1; //cast implícito
	//Cuenta cuenta = (Cuenta)cc1; //cast explicito.
						// esto se lo conoce como casteo(obligo a java a que se amolde)
	CuentaCorriente cc = (CuentaCorriente)arrayCuenta[1];
	for (Object c : arrayCuenta) {p(c);}
	
	/*Cliente cliente = new Cliente();
	Cuenta cuenta = (Cuenta) cliente; //imposible, no compila
	 *	cliente no extiende la clase de Cuenta ni implementa una interfaz de tipo de Cuenta,
	 *  es imposible que funcione ese cast, ya que una referencia de tipo de Cuenta 
	 *  nunca puede apuntar a un objeto del tipo de Cliente.*/
	int[] edades = {10,15,18,19};
	p("-----");	
	for (int i : edades) {
		p(i);
	}
	p("-----");	
	// alterando el tipo
    Cuenta[] cuentas = new Cuenta[5];
    //crea una instancia de cuentaCorreinte
    CuentaCorriente cc2 = new CuentaCorriente(80, 88);
    cuentas[0] = cc2;

    // crea instancia de CuentaAhorro
    CuentaAhorro ca2 = new CuentaAhorro(22, 22);
    cuentas[1] = ca2;    

    System.out.println(cuentas[1].getNumero()  );

    // realizando cast
    CuentaCorriente referenciaCC = (CuentaCorriente) cuentas[0];
    System.out.println(cc2.getNumero());
    System.out.println(referenciaCC.getNumero());
	
	
	}
	public static void p(Object p) {
		System.out.println(p);
	}
}


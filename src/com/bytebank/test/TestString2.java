package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;

public class TestString2 {
	public static void main(String[] args) {
		
		
		
		Cuenta cu = new CuentaAhorro(175,100002);
		p(cu);
		System.out.println();
	
	}
		public static void p(Object obj) {
			System.out.println(obj);
		}

}
package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestGuardaCuenta {
	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta ca = new CuentaAhorro(10, 10005);
		Cuenta cc = new CuentaAhorro(20, 10009);
		//guardaCuentas.adicionar(ca);
		guardaCuentas.adicionar(cc);
		
		p(guardaCuentas.obtener(0));
				
		GuardarVarios guardarvarios = new GuardarVarios();
		//guardarvarios.create("lalaalalalall");
		//guardarvarios.create(2545456+"asasas");
		guardarvarios.create(ca);
		p(guardarvarios.read(0));
		guardarvarios.delete(0);
		p(guardarvarios.read(0));
		
		
	}
	

	public static void p(Object ob) {
		System.out.println(ob);
	}
}

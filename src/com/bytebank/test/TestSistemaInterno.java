package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		Gerente ge = new Gerente();
		Administrador ad = new Administrador();
		ge.setClave("123");
		ad.setClave("12345");
		Cliente cli = new Cliente();
		cli.setClave("123456");
		System.out.println(cli.iniciarSesion("123456"));
		
		si.autentica(ad);
		si.autentica(ge);
	}
}

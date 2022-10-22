package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestCuenta {
	public static void main(String[] args){//agencia 12, 2 numeroDeAgencia 
		Cuenta ca = new CuentaAhorro(12, 2);
		//Cuenta cc = new CuentaCorriente(13, 3);
		ca.deposita(100);
		try {
			ca.saca(10);
			ca.saca(99);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cc.depositar(1000);
		//cc.transferir(1000,ca);
		System.out.println("ca.getSaldo "+ca.getSaldo());
		//System.out.println("cc.getSaldo "+cc.getSaldo());
	}
}

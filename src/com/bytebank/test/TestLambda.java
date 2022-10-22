package com.bytebank.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.bytebank.modelo.*;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cc1 = new CuentaCorriente(20, 33);
		Cliente clienteCc1 = new Cliente();
		clienteCc1.setNombre("Diego");
		cc1.setTitular(clienteCc1);
		cc1.deposita(333.30);
		
		Cuenta cc2 = new CuentaAhorro(30, 44);
		Cliente clienteCc2 = new Cliente();
		clienteCc2.setNombre("Ariel");
		cc2.setTitular(clienteCc2);
		cc2.deposita(444.0);
		
		Cuenta cc3 = new CuentaCorriente(10, 11);
		Cliente clienteCc3 = new Cliente();
		clienteCc3.setNombre("Celeste");
		cc3.setTitular(clienteCc3);
		cc3.deposita(555.60);
		
		Cuenta cc4 = new CuentaAhorro(40, 22);
		Cliente clienteCc4 = new Cliente();
		clienteCc4.setNombre("Belen");
		cc4.setTitular(clienteCc4);
		cc4.deposita(222.20);
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
	
		lista.forEach( cuenta -> p(cuenta));
				
		p("-----------");
		lista.sort(( o1, o2) -> o1.getAgencia() - o2.getAgencia() );

		lista.forEach( cuenta -> p(cuenta));
		
		//CLASE ANONIMA Lambda↓↓↓
		lista.sort(( o1,  o2) -> 
			o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre()) );
		
		p("\n --despues de ordenar↓↓↓-- \n"); 	
		lista.forEach( cuenta -> p(cuenta));
		
		
	}
	public static void p(Object ob) {
		System.out.println(ob);
	}
}


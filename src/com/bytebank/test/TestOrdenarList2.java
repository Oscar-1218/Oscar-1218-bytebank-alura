package com.bytebank.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.*;

public class TestOrdenarList2 {

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
		//antes de ordenar
	
		p("-------");
		for (Cuenta cuentaNombre : lista) {
			p(cuentaNombre);
		}
		
		//ordenar cuentas
		/* Me evito esta linea de cod debido a que genero la instancia dentro de 
		 * el sort
		Comparator<Cuenta> comparator = new ordenadorPorNombre();*/
	  /*lista.sort(new ordenadorPorNombre());*/
		
		//CLASE ANONIMA
		lista.sort(new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				 return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		/*interface funcional : es la que tiene un solo metodo para implementar.
		 * Estas fueron creadas a partir de java 8*/
		
		p("\n --despues de ordenar↓↓↓-- \n"); 	
		for (Cuenta cuentaNombre : lista) {
			p(cuentaNombre);
		}
		
	}
	public static void p(Object ob) {
		System.out.println(ob);
	}
}


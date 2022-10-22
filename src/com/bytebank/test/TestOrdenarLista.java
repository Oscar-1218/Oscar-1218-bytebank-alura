package com.bytebank.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.*;

public class TestOrdenarLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cc1 = new CuentaCorriente(20, 33);
		Cuenta cc2 = new CuentaAhorro(30, 44);
		Cuenta cc3 = new CuentaCorriente(10, 11);
		Cuenta cc4 = new CuentaAhorro(40, 22);
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		//antes de ordenar
		for (Cuenta cuenta : lista) {
			p(cuenta);
		}
		
		//ordenar cuentas
		
		//Comparator<Cuenta> comparator = new ordenadorPorNumeroDeCuenta();
		//ASI ↓↓↓↓↓ CREO UN METODO DIRECTO DESDE LA INTERFACE SIN CREAR UNA NUEVA CLASE.
		//CLASE ↓↓↓↓ ANONIMA
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return Integer.compare(o1.getNumero(), o2.getNumero());
			}
			
		});
		p("//despues de ordenar");
		for (Cuenta cuenta : lista) {
			p(cuenta);
		}
		
		p("Arielito");
	}
	public static void p(Object ob) {
		System.out.println(ob);
	}
}
/*
class ordenadorPorNumeroDeCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//FORMULA BASICA
		/*if(o1.getNumero() == o2.getNumero()) {
			return 0;
		} else if(o1.getNumero() > o2.getNumero()) {
			return 1; //debo retornar cualquier entero positivo.
		}else return -1; //retorno cualquier entero negativo.
	}		ES LO MISMO↓↓↓*/
		//FORMULA INTERMEDIA
		/*return o1.getNumero() - o2.getNumero();
		Esto ↑↑ funciona porque: si son iguales, luego de restarse quedará 0, si A 
		 * es mayor que B retornará Positivo, y viceversa en caso de que B sea mayor*
		//FORMULA WRAPPER
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}
*/
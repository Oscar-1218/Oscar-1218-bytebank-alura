package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.bytebank.modelo.*;

//Clase de java.util (utilitarios)
public class TestArrayList {

	public static void main(String[] args) {
									// <> se lo conoce como operador Diamante.
	  /*ArrayList<Cuenta> lista = new ArrayList<>();*/ 
	// referencia		objeto-> se guarda en la memoria Heap.
		List<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(10, 10003);
		Cuenta cc2 = new CuentaCorriente(15, 10004);
		Cuenta cc3 = new CuentaCorriente(10, 10003);
		lista.add(cc);
		lista.add(cc2);

		Cuenta obtenerCuenta = (Cuenta)lista.get(0);
		/*p(obtenerCuenta); // ó ↓↓
		p(lista.get(1));*/
		p(lista.size());
		//p(lista.contains(cc3));// Da False. Pq compara por referencia.
		//p(cc.esIgual(cc3)); //Da True. Pq comparo por valores de la cuenta.
		p("---");
		p(lista.contains(cc3));//Ahora sobreEscrito el metodo ya Si compara los valores.
		
		for (Cuenta x : lista) {
			 p(x);
		}
	}
	public static void p(Object ob) {
		System.out.println(ob);
	}

}

package com.bytebank.test;
/*import com.bytebank.modelo.Funcionario; //Es lo mismo que com.bytebank.modelo.Contador (por ejemplo).
import com.bytebank.modelo.Contador; //Es lo mismo que com.bytebank.modelo.Contador (por ejemplo).
import com.bytebank.modelo.Gerente; //Es lo mismo que com.bytebank.modelo.Contador (por ejemplo).
 ó ó0*/
import com.bytebank.modelo.*; // * Asi obtengo el acceso a todo  y no preciso importar uno por uno↑↑.

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario= new Contador();
		Contador contador = new Contador();
		/*package + classname*/
		Gerente gerente= new Gerente();
		contador.setSalario(1000);
		contador.setNombre("contador");
		funcionario.setSalario(1000);
		funcionario.setNombre("funcionario");
		gerente.setNombre("gerente");
		gerente.setSalario(1000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(contador);
		controlBonificacion.registrarSalario(gerente);
		
	}
}

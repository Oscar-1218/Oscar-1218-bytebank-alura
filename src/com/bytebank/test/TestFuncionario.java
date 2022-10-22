package com.bytebank.test;
import com.bytebank.modelo.*;
//camelCase<Camello> || snake_case<serpiente>
public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario ariel = new Contador();
		ariel.setDocumento("35236538");
		ariel.setNombre("Arielito");
		ariel.setSalario(400.5);
		//ariel.setTipo(0);
		System.out.println("bono funcionario: "+ariel.getBonificacion());
		
		
		//Funcionario tete = new Gerente()
		Gerente gerente = new Gerente();
		gerente.setClave("AluraCursos");
		gerente.setSalario(1600);
		
		System.out.println("Inicio sesion es: "+gerente.iniciarSesion("AluraCursos"));
		System.out.println("bono gerente: "+gerente.getBonificacion());
	}
}

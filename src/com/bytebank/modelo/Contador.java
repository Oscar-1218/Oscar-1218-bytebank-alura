package com.bytebank.modelo;

public class Contador extends Funcionario{
	

	//SOBRE-ESCRITURA del metodo. Si no lo sobreescribo es como si fuese un metodo inventado en esta misma clase.
	@Override
	public double getBonificacion() {
		return 200;
	}
}

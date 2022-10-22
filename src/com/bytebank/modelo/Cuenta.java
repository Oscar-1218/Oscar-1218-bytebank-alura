package com.bytebank.modelo;
/**
 * La cuenta va a crear nuevas instancias de cuentacorriente, CuentaAhorro etc.
 *  Con '/**' obtengo el comentario de autor.
 *  Con '@' me apareceran otros nombres para los comentarios ej:
 * @author ariel
 * @version 1.0
 */

/*
 * @param (usado en el método y constructor)
*@return (usado solo en el método)
@exception o @throws (en el método o constructor)
*@see
*@since
*@seriel
*@deprecated*/
public abstract class Cuenta  {
	protected double saldo; // con 'private' nadie puede modificar directamente el saldo.
	private int agencia;	
	private int numero;	
	private Cliente titular = new Cliente(); //hago referencia a 'class Cliente' y asi los conecto con esta 'class'.
	private static int total = 0;
	
	public Cuenta() {
	}
	
	//↓↓ este metodo se le llama CONSTRUCTOR
	public Cuenta(int agencia, int numero) {
		//System.out.println("Has creado una cuenta");
		this.numero = numero;
		/*if(numero <= 0) this.numero = 18; else */
		/*if(agencia <= 0) this.agencia = 1111; else*/ 
		this.agencia = agencia;
		total++;	
	}
	
	public static int getTotal() {
		return total;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	//defino metodos. valor($)
	public abstract void depositar(double valor);
	//this saldo(objeto) = this.saldo + valor
		//this.saldo +=  valor;
	
	public boolean retirar(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
			}
		System.out.println("Fondos insuficientes, prueba con menos");
		return false;
		}
	
	//refactor = Es la reconstruccion del codigo para mejorarlo.
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Valor invalido: Saldo: " + this.saldo + ", Valor: " + valor);
			//throw new SaldoInsuficienteException("Saldo insuficiente !POBRE!");//si quito esta linea el codigi se ejecuta dejando valores negativos si retiro mas dinero del total de la cuenta.
		}
		this.saldo -= valor;
	}
	public void deposita(double valor) {
		this.saldo += valor ; 
	}
	
	public boolean transferir(double valor, Cuenta destino) throws SaldoInsuficienteException {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
			}
		return false;
			}
	
	
	public double getSaldo() {
		//System.out.println("getSaldoProfe Saldo de "+titular.nombre+" es de: "+this.saldo);
		return this.saldo;
	}
	
	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		/*int numAgen = this.agencia;
		int numCuen= this.numero; ó */
		String cuenta = "Agencia: "+ this.agencia +". Numero: "+
				this.numero+ ". Titular: "+ this.titular.getNombre();
		return cuenta;
	}
	
	@Override
	public boolean equals(Object cu) {
		Cuenta cuenta = (Cuenta)cu;
		return this.agencia == cuenta.getAgencia() && 
				this.numero == cuenta.getNumero(); 
	}
		
}

















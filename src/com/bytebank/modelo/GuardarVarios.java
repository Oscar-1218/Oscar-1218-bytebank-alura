package com.bytebank.modelo;

public class GuardarVarios {
	
	Object[] objvarios = new Object[5];
	int indice = 0 ;
	
	
	public void create(Object ob) {
		this.objvarios[indice] = ob;
		indice++;
	}
	
	public Object read(int i) {
		return objvarios[i];
	}
	
	public void update(int i, Object ob) {
		this.objvarios[i]= ob;
	}
	
	public void delete (int i) {
		this.objvarios[i] = null;
	}
}

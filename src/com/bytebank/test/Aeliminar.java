package com.bytebank.test;
import java.util.Arrays;

public class Aeliminar{
    public static void main(String[] args)
    {
        int[] numeros = {43, 15, 64, 22, 89,11,88};
       
        p(Arrays.toString(numeros)); //
        
        Arrays.sort(numeros); //método utilitário sort

        p(Arrays.toString(numeros)); //método utilitário toString
        //Salida : [15, 22, 43, 64, 89]
        
    }
//si tiene Static No necesita ser llamado a travez de una instancia.
public static void p(Object ob) {
	System.out.println(ob);
	}
}
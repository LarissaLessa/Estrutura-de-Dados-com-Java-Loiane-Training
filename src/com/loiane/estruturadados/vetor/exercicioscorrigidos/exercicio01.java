package com.loiane.estruturadados.vetor.exercicioscorrigidos;

import com.loiane.estruturadados.vetor.Lista;

public class exercicio01 {

	public static void main(String[] args) {
		Lista<String> Lista = new Lista<String>(5);
		
		Lista.adiciona("A");
		Lista.adiciona("B");
		Lista.adiciona("C");
		
		System.out.println(Lista.contem("A"));
		System.out.println(Lista.contem("B"));
		System.out.println(Lista.contem("E"));
	}

}

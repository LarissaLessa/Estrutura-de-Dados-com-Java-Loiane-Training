package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;


public class exercicio02 {

	public static void main(String[] args) {
		/*Exercício 01 -----
		 * 	Melhore a classe Lista e implemente o método ultimoIndice, semelhando ao método lastIndexOf da classe ArryList
		*/		
		
		Lista<String> Lista = new Lista<String>(5);
		
		Lista.adiciona("A");
		Lista.adiciona("B");
		Lista.adiciona("C");
		
		System.out.println(Lista.ultimoIndice("A"));
		
	}

}

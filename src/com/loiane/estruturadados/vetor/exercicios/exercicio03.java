package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class exercicio03 {

	public static void main(String[] args) {
		/*Exercício 03 -----
		 * 	Melhore a classe Lista e implemente o método remove(T elemento), ]
		 * onde sera possível remover um elemento da lista passando o mesmo como parâmetro
		*/		
		
		Lista<String> Lista = new Lista<String>(5);
		
		Lista.adiciona("Loiane");
		Lista.adiciona("Larissa");
		Lista.adiciona("Fernanda");
		
		Lista.remove("A");
		System.out.println(Lista);

	}
		

}


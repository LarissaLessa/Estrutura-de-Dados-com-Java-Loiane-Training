package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11 {
	
	public static void main(String[] args) {
		
		/*
		VetorObjetos vetor = new VetorObjetos(2);
		
		vetor.adiciona(1);
		vetor.adiciona("Elemento do tipo String");

		System.out.println(vetor);
		
		*/
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		
		vetor.adiciona(c1);
	}
}

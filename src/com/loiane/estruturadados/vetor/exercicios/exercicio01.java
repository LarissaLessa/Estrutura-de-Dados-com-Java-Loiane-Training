package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class exercicio01 {

	public static void main(String[] args) {
		//Exercício 01 -----
		//Melhore a classe Lista e implemente o método contém, semelhando ao método contains da classe ArryList
		
		
		Lista<String> Lista = new Lista<String>(4);
		
		//Adicionando um objeto no arrayList
		Lista.adiciona("Loiane");
		Lista.adiciona("Larissa");
		Lista.adiciona("Fernanda");
		
		boolean existe = Lista.contem("Beatriz");
		if(existe) {
			
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
	}

}

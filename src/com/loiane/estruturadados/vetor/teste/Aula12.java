package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//Adicionando um objeto no arrayList
		arrayList.add("A");
		arrayList.add("C");

		System.out.println(arrayList);
		
		//Adicionando um objeto na posição 1 do arrayList
		arrayList.add(1,"B");
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
		int pos = arrayList.indexOf("B");
		if (pos > -1){
			System.out.println("Elemento existe no array na pos " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		//Busca por posição
		System.out.println(arrayList.get(4));
		
		
		//Remover
		arrayList.remove(0); //Removendo por posição
		
		arrayList.remove("B"); // removendo por objeto
		
		System.out.println(arrayList);
		
		//Tamanho do Array
		System.out.println(arrayList.size());
		
	}

}

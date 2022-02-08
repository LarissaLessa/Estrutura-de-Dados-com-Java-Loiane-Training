package com.loiane.estruturadados.vetor;


public class Lista<T>{

	private T[] elementos;
	private int tamanho;
	/*
	public VetorObjetos ( int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}*/
	
	/*
	public VetorObjetos ( int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[])Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
	*/
	
	
		//Instanciando a classe
		public Lista(int capacidade){
			this.elementos = (T[]) new Object[capacidade]; //solução do livro effective Java
			this.tamanho = 0;
		}
	
		
		public Lista(){
			this(10);
		}
		
		public boolean adiciona (T elemento) {
			this.aumentaCapacidade(); //Aumentando capacidade do vetor
			
			if (tamanho < elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
		}
		
		// 0 1 2 3 4 5 6 = tamanho é 5
		// B C E F G + +
		//
		public boolean adiciona (int posicao, T elemento) {
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida");
			}
			
			this.aumentaCapacidade(); //Aumentando capacidade do vetor
			
			//mover todos os elementos do vetor
			for (int i=this.tamanho-1; i>=posicao; i--) {
				this.elementos[i+1] = this.elementos[i];
				
			}
			
			this.elementos[posicao] = elemento;
			this.tamanho++;
			
			return false;
		}
		
		private void aumentaCapacidade(){
			
			if(this.tamanho == this.elementos.length) {
				
				T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
				
				for (int i = 0; i<this.elementos.length; i++) {
					
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		public T busca(int posicao) {
			
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida");
			}
			return this.elementos[posicao];
		}
		
	
		public int busca(T elementos) {
			for (int i =0; i <this.tamanho; i++) {
				if (this.elementos[i].equals(elementos)) {
					return i;
				}
			}
			return -1;
			
		}
		
		public boolean contem (T elemento) {
			
			/*int pos = busca(elemento);
			if (pos > -1) {
				return true;
			}
			return false;*/
			
			return busca(elemento) > -1; //>=0
		}
		
		public int ultimoIndice (T elemento) {
			for (int i =this.tamanho-1; i>=0; i--) {
				if (this.elementos[i].equals(elemento)) {
					return i;
				}
				return -1;
			}
			return tamanho;
			
		}
		
		
		public void remove(T elemento) {
			int pos = this.busca(elemento);
			
			if(pos > -1) {
				this.remove(pos);
			}
		}
		
	
		private void remove(int pos) {
			// TODO Auto-generated method stub
			
		}


		public int tamanho() {
			return this.tamanho;
		}
		
		
		/*
		public void remove(String string) {
			if(!(string >= 0 && string < tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida");
			}
			
			for (int i=string; i<=this.tamanho-1; i++){
				this.elementos[i] = this.elementos[i+1];
			}
			
			this.tamanho--;
			
			
		}*System.out.printlN(pilha./
		
		@Override
		public String toString() {
			
			StringBuilder s = new StringBuilder();
			s.append("[");
			
			for (int i=0; i<this.tamanho-1; i++) {
				s.append(this.elementos[i]);
				s.append(",");
			}
			if (this.tamanho>0) {
				s.append(this.elementos[this.tamanho-1]);
			}
			s.append("]");
			
			return s.toString();
		}*/
		
		

}

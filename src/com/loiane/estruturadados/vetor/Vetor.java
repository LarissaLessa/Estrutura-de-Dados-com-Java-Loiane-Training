package com.loiane.estruturadados.vetor;


public class Vetor {
			
	private String[] elementos;
	private int tamanho;
	
	public Vetor ( int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/* ADICIONANDO ELEMENTOS NO VETOR - MANEIRA MENOS EFIVIENTE
	 * 
	 *  - Adicionando um elemento no vetor
	 * 
	public void adiciona (String elemento) {
		
		//FOR IRA PERCORRER O VETOR DE N ELEMENTOS
		for (int i =0; i<this.elementos.length; i++) {
			
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
		
	}*/
	
	/* ADICIONANDO ELEMENTOS NO VETOR 
	 * 	OPÇÃO 1 - COM EXCEPTION
	public void adiciona (String elemento) throws Exception{
		
		//Verificando se o tamanho é maior que a capacidade do vetor
		if(this.tamanho <this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("Vetor já está cheio, não é possível adicionar novos elementos");
		}
		
	}*/
	
	/* ADICIONANDO ELEMENTOS NO VETOR - 
	 * OPÇÃO 2 - BOOLEAN
	 */
		public boolean adiciona (String elemento) {
			this.aumentaCapacidade(); //Aumentando capacidade do vetor
			
			if (tamanho < elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
		}
		
		//B C E F G + + = tamanho é 5
		//0 1 2 3 4 5 6
		public boolean adiciona (int posicao, String elemento) {
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
				
				String[] elementosNovos = new String[this.elementos.length * 2];
				
				for (int i = 0; i<this.elementos.length; i++) {
					
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		/* ------------ */
		
		//Buscar o elemento no vetor
		public String busca(int posicao) {
			
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida");
			}
			return this.elementos[posicao];
		}
		
		/* ------------ */
		//Verificando se existe o elemento no vetor
		public int busca(String elementos) {
			for (int i =0; i <this.tamanho; i++) {
				if (this.elementos[i].equals(elementos)) {
					return i;
				}
			}
			return -1;
			
		}
		
		
		/* ------------ */
		public int tamanho() {
			return this.tamanho;
		}
		
		//B G D E F -> posição a ser removida é 1 (G)
		//0 1 2 3 4 -> tamanho é 5
		// vetor[1] = vetor = [2]
		// vetor[2] = vetor = [3]
		// vetor[3] = vetor = [4]
		public void remove(int posicao) {
			if(!(posicao >= 0 && posicao < tamanho)) {
				throw new  IllegalArgumentException("Posição Inválida");
			}
			
			for (int i=posicao; i<=this.tamanho-1; i++){
				this.elementos[i] = this.elementos[i+1];
			}
			
			this.tamanho--;
			
			
		}
		
		/* ------------ */
		/* A classe StringBuilder para concatenação */
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
		}
		
	
}

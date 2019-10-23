/**
 * 
 */
package br.com.caelum.ed.vetor;

/**
 * Classe para armazenar os objetos e suas informacoes
 * 
 * @author Matos
 *
 */
public class Vetor {

	// Declarando e Inicializando um array de Objetos com capacidade 100.
	private Object[] objetos = new Object[100];
	
	private int totalObjetos = 0;
	
	/**
	 * Adiciona um objeto
	 * 
	 * @param obj
	 */
	public void adiciona(Object objeto) {
		
		this.garantaEspaco();
		this.objetos[this.totalObjetos] = objeto;
		this.totalObjetos++;
		
	}
	

	/**
	 * Adiciona um objeto na posição indicada
	 * 
	 * @param posicao
	 * @param objeto
	 */
	public void adiciona(int posicao, Object objeto) {
	
		this.garantaEspaco();
		
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida!");
		} 
		
		//Verifica se a posicao não esta ocupada antes de inserir
		if (!this.posicaoOcupada(posicao)) {
			for(int i = this.totalObjetos - 1; i >= posicao; i-- ) {
				this.objetos[i + 1] = this.objetos[i];
			}
			
			this.objetos[posicao] = objeto;
			this.totalObjetos++;
		}
		
		
	}
	
	/**
	 * Obtem o objeto na posicao informada
	 * 
	 * @param posicao
	 * 
	 * @return
	 */
	public Object pega(int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		
		return this.objetos[posicao];
	}
	
	
	/**
	 * Remove o objeto 
	 * 
	 * @param posicao
	 */
	public void remove(int posicao) {
	
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		
		for(int i = posicao; i < this.totalObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		
		this.totalObjetos--;
	}
	
	/**
	 * Verifica se o objeto existe
	 * 
	 * @param objeto
	 * 
	 * @return
	 * 		True or False
	 */
	public boolean contem(Object objeto) {
		
		boolean contemObj = false;
		
		for(int i = 0; i < this.totalObjetos; i++) {
			if(objeto.equals(this.objetos[i])) {
				contemObj = true;
			}
		}
		return contemObj;
	
	}
	
	/**
	 * Metodo para garantir que existe espaço no array para
	 * inserir novos objetos.
	 * 
	 */
	public void garantaEspaco() {
		
		if(this.totalObjetos == this.objetos.length) {
			Object[] novoArray = new Object[this.objetos.length * 2];
			for(int i = 0; i < this.objetos.length; i++) {
				novoArray[i] = this.objetos[i];
			}
			
			this.objetos = novoArray;
		}
		
	}
	
	/**
	 * Metodo para verificar se a posicao informada é válida
	 * 
	 * @param posicao
	 * 
	 * @return
	 */
	public boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalObjetos;
	}

	
	/**
	 * Metodo para verificar se a posição informada já está ocupada.
	 * 
	 * @param posicao
	 * 
	 * @return
	 */
	public boolean posicaoOcupada(int posicao) {
		boolean posOcupada = false;
		
		for(int i = 0; i < objetos.length; i++) {
			if(objetos[posicao] != null) {
				System.out.println("Posicao ocupada, o objeto não pode ser inserido."); ;
				posOcupada = true;
				break;
			}
		}
		return posOcupada;
	}

	
	/**
	 * Verifica o tamanho do Array
	 * 
	 * @return
	 * 		Tamanho do array
	 */
	public int tamanho() {
		return this.totalObjetos;
	}
	
	
	/**
	 * Retorna o nome do objeto
	 */
	public String toString() {
		
		if(this.totalObjetos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	
}

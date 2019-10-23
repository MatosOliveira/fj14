/**
 * 
 */
package br.com.caelum.ed.listaligadas;

/**
 * Classe para armazenar/tratar uma lista de elementos
 * 
 * @author Matos
 *
 */
public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;
	
	/**
	 * Metodo que adiciona um elemento no comeco da lista
	 * 
	 * @param elemento
	 * 		Elemento a ser adicionado
	 */
	public void adicionaNoComeco(Object elemento) {
		
		if(totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.totalDeElementos++;
	}
	
	/**
	 * Metodo que adiciona um elemento no fim da lista
	 * 
	 * @param elemento
	 * 		Elemento a ser adicionado
	 */
	public void adicionaNoFim(Object elemento) {
		
		if(totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}
	
	/**
	 * Adiciona um elemento em qualquer posicao
	 * 
	 * @param posicao
	 * 		Posicao a ser adicionado
	 * @param elemento
	 * 		Elemento a ser adicionado
	 */
	public void adiciona(int posicao, Object elemento) {
		
		if(posicao == 0) { //No comeco
			this.adicionaNoComeco(elemento);
		} else if(posicao == this.totalDeElementos) {//No fim
			this.adicionaNoFim(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			
			this.totalDeElementos++;
		}
	}

	/**
	 * Retorna a posicao atual
	 * 
	 * @param posicao
	 * 		Posicao informada
	 * @return
	 * 		Celula atual
	 */
	public Celula pegaCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao não existe!");
		}
		
		Celula atual = primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
	
	/**
	 * Verifica se a posicao já está ocupada
	 * 
	 * @param posicao
	 * 		Posicao onde será inserido o novo elemento na lista
	 * @return
	 * 		Numero da posicao
	 */
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	/**
	 * Retorna o tamanho da Lista
	 * 
	 * @return
	 * 		Total de Elementos
	 */
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	/**
	 * Obtem o elemento de acordo com a posicao informada
	 * 
	 * @param posicao
	 * 		Posicao do elemento
	 * @return
	 * 		O elemento da lista
	 */
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	/**
	 * Verifica se o elemento existe na lista
	 * 
	 * @param elemento
	 * 		Elemento verificado
	 * @return
	 * 		Verdadeiro ou falso
	 */
	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		
		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			
			atual = atual.getProxima();
		}
		
		return false;
	}
	
	/**
	 * Remove um elemento do começo da lista
	 */
	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	/**
	 * Remove um elemento do fim da fila
	 */
	public void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}	
	}
	
	/**
	 * Remove um elemento de qualquer posicao
	 * 
	 * @param posicao
	 * 		Posicao do elemento a ser removido da lista
	 */
	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
			
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}
	}
	
	/**
	 * Implementacao do Metodo ToString
	 */
	public String toString() {
		
		//Verifica se a lista esta vazia
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		//Percorrendo ate o penultimo elemento
		for(int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//Ultimo elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
}

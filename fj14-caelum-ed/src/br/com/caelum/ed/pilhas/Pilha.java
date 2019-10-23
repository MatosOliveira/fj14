/**
 * 
 */
package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.Peca;

/**
 * Classe para estrutura de dados do tipo Pilha
 * 
 * @author Matos
 *
 */
public class Pilha {

	private List<Peca> pecas = new LinkedList<Peca>();
	
	/**
	 * Insere uma nova peça
	 * 
	 * @param p
	 * 		Peça a ser inserida
	 */
	public void inserePeca(Peca p) {
		this.pecas.add(p);
	}
	
	/**
	 * Remove uma peça
	 * 
	 * @return
	 * 		Peça removida
	 */
	public Peca remove() {
		return this.pecas.remove(this.pecas.size() - 1);
	}
	
	/**
	 * Verifica se a pilha está vazia
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.pecas.size() == 0;
	}
	
}

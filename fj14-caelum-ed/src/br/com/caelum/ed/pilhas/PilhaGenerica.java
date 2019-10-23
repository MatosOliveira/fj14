/**
 * 
 */
package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe para estrutura de dados do tipo Pilha
 * 
 * @author Matos
 *
 */
public class PilhaGenerica {

	private List<Object> itens = new LinkedList<Object>();
	
	/**
	 * Insere um novo item
	 * 
	 * @param p
	 * 		Item a ser inserido
	 */
	public void insere(Object p) {
		this.itens.add(p);
	}
	
	/**
	 * Remove uma peça
	 * 
	 * @return
	 * 		Peça removida
	 */
	public Object remove() {
		return this.itens.remove(this.itens.size() - 1);
	}
	
	/**
	 * Verifica se a pilha está vazia
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.itens.size() == 0;
	}
	
}

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
 * @param <T>
 *
 */
public class PilhaParametrizada<T> {

	private List<T> itens = new LinkedList<T>();
	
	/**
	 * Insere um novo item
	 * 
	 * @param t
	 * 		Item a ser inserido
	 */
	public void insere(T t) {
		this.itens.add(t);
	}
	
	/**
	 * Remove uma peça
	 * 
	 * @return
	 * 		Peça removida
	 */
	public T remove() {
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

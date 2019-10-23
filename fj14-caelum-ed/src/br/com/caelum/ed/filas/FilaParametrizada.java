/**
 * 
 */
package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe para estrutura de dados do tipo Fila<T>
 * 
 * @author Matos
 *
 */
public class FilaParametrizada<T> {
	
	private List<T> objetos = new LinkedList<T>();
	
	/**
	 * Insere no final da fila
	 * 
	 * @param t
	 * 		Objeto a ser inserido
	 */
	public void insere(T t) {
		this.objetos.add(t);
	}
	
	/**
	 * Remove do inicio da fila
	 * 
	 * @return
	 * 		Objeto removido
	 */
	public T remove() {
		return this.objetos.remove(0);
	}
	
	/**
	 * Verifica se a fila está vazia
	 * 
	 * @return
	 * 
	 */
	public boolean vazia() {
		return this.objetos.size() == 0;
	}
}

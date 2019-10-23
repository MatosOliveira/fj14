/**
 * 
 */
package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe para estrutura de dados do tipo Fila (qualquer objeto)
 * 
 * @author Matos
 *
 */
public class FilaGenerica {
	
	private List<Object> objetos = new LinkedList<Object>();
	
	/**
	 * Insere no final da fila
	 * 
	 * @param t
	 * 		Objeto a ser inserido
	 */
	public void insere(Object t) {
		this.objetos.add(t);
	}
	
	/**
	 * Remove do inicio da fila
	 * 
	 * @return
	 * 		Objeto removido
	 */
	public Object remove() {
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

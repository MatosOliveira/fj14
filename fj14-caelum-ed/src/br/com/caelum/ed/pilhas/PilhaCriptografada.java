/**
 * 
 */
package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe utilizada para criptografar uma mensagem e descriptografar.
 * 
 * @author Matos
 * @param <T>
 *
 */
public class PilhaCriptografada<T> {

	private List<Character> letras = new LinkedList<Character>();
	
	/**
	 * Insere um novo caracter
	 * 
	 * @param s
	 * 		Caracter a ser inserido
	 */
	public void insere(Character s) {
		this.letras.add(s);
	}
	
	/**
	 * Remove uma letra
	 * 
	 * @return
	 * 		Letra removida
	 */
	public Character remove(Character s) {
		return s;
	}
	
	/**
	 * Verifica se a pilha está vazia
	 * 
	 * @return
	 */
	public boolean vazia() {
		return this.letras.size() == 0;
	}
	
}

/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.Pilha;

/**
 * Classe de testes para Pilha
 * 
 * @author Matos
 *
 */
public class TestesPilha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Peca peca = new Peca();
		
		//Insere uma peca na pilha
		pilha.inserePeca(peca);
		
		//Remove uma peca da pilha
		Peca pecaRemovida = pilha.remove();
		
		if(peca != pecaRemovida) {
			System.out.println("Erro: a peça removida é diferente da que foi inserida");
		}
		
		//Verifica se a pilha está vazia
		if(!pilha.vazia()) {
			System.out.println("Erro: a pilha não está vazia");
		}

	}

}

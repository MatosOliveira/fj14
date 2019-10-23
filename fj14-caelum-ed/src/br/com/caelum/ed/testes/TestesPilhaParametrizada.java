/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

/**
 * @author Matos
 *
 */
public class TestesPilhaParametrizada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		Peca peca = new Peca();
		
		pilhaDePecas.insere(peca);
		Peca pecaRemovida = pilhaDePecas.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a peça removida não é igual " +
						" a que foi inserida");
		}
		
		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		}
		
		PilhaParametrizada<String> pilhaDeString = new PilhaParametrizada<String>();
		
		pilhaDeString.insere("Manoel");
		pilhaDeString.insere("Zuleide");
		
		System.out.println(pilhaDeString.remove());
		System.out.println(pilhaDeString.remove());

	}

}

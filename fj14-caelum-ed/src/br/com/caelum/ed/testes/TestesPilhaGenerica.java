/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

/**
 * @author Matos
 *
 */
public class TestesPilhaGenerica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PilhaGenerica pilhaDePecas = new PilhaGenerica();
		Peca peca = new Peca();
		
		pilhaDePecas.insere(peca);
		Object pecaRemovida = pilhaDePecas.remove();
		
		if(peca != pecaRemovida){
			System.out.println("Erro: a pe�a removida n�o � igual " +
							" a que foi inserida");
		}
		
		if (!pilhaDePecas.vazia()) {
			System.out.println("Erro: A pilha n�o est� vazia");
		}
		

	}

}

/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspelhamento;

/**
 * Teste para o espelhamento
 * 
 * @author Matos
 *
 */
public class TesteEspelhamento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
		
		for (int i = 0; i < 50000; i++) {
			conjunto.adiciona("palavra" + i);
		}
		
		for (int i = 0; i < 50000; i++) {
			conjunto.contem("palavra" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.0);
		
		//conjunto.imprimeTabela();
	}

}

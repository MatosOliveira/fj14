/**
 * 
 */
package br.com.caelum.ed.testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspelhamento;

/**
 * Classe de Teste para Conjuntos
 * 
 * @author Matos
 *
 */
public class TesteAdicionaConjunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodas();
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}

}

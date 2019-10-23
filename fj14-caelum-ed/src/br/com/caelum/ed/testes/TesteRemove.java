/**
 * 
 */
package br.com.caelum.ed.testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspelhamento;

/**
 * Teste para remoção da palavra
 * 
 * @author Matos
 *
 */
public class TesteRemove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConjuntoEspelhamento conjunto = new ConjuntoEspelhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodas();
		
		System.out.println("=== Antes de remover === " + 
				"\nTamanho da tabela: " + conjunto.tamanho());
	
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		// Após a remoção
		conjunto.remove("Rafael");
		
		palavras = conjunto.pegaTodas();
		
		System.out.println("=== Depois de remover === " +
				"\nTamanho da tabela: " + conjunto.tamanho());
		conjunto.imprimeTabela();
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}

}

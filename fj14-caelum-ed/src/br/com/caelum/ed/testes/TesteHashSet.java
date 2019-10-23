/**
 * 
 */
package br.com.caelum.ed.testes;

import java.util.HashSet;

/**
 * Utilizando a classe HashSet (API do Java) para implementarmos um conjunto generico
 * 
 * @author Matos
 *
 */
public class TesteHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<String> conjunto = new HashSet<String>();
		
		conjunto.add("Rafael");
		conjunto.add("Rafael");
		conjunto.add("Ana");
		conjunto.add("Paulo");
		
		System.out.println(conjunto);

	}

}

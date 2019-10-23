/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.filas.FilaParametrizada;

/**
 * @author Matos
 *
 */
public class TesteFilaParametrizada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();
		
		//Insere
		filaDeString.insere("Adelaide");
		filaDeString.insere("Carolina");
		
		//Remove
		String carolina = filaDeString.remove();
		String adelaide = filaDeString.remove();
		
		System.out.println(carolina);
		System.out.println(adelaide);

	}

}

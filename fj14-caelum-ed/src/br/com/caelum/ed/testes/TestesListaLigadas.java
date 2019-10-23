/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.listaligadas.ListaLigada;

/**
 * @author Matos
 *
 */
public class TestesListaLigadas {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		//Adiciona
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		
		System.out.println(lista);
	}
}


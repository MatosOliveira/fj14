/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetor.Vetor;

/**
 * Classe de testes da implementacao de Aluno
 * 
 * @author Matos
 *
 */
public class TesteAdicionaNoFim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.setNome("João");
		a2.setNome("José");
		a3.setNome("Marcos");
		a4.setNome("Pedro");
		
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		//Teste para inserir na mesma posicao
		lista.adiciona(2, a3);
		lista.adiciona(3, a4);
		
		//System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);

	}

}

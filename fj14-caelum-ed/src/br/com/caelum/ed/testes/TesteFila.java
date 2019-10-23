/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.filas.Fila;

/**
 * @author Matos
 *
 */
public class TesteFila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		Aluno aluno = new Aluno();
		
		
		//Insere na fila
		fila.insere(aluno);
		
		//Remove da fila
		Aluno alunoRemovido = fila.remove();
		
		if(aluno != alunoRemovido) {
			System.out.println("Erro: O aluno removido não é igual ao que foi inserido.");
		}
		
		if(fila.vazia()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("Erro: a fila não está vazia!");
		}
		
	}
	
}



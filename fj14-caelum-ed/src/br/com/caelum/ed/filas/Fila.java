/**
 * 
 */
package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.Aluno;

/**
 * Classe para estrutura de dados do tipo Fila
 * 
 * @author Matos
 *
 */
public class Fila {
	
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	/**
	 * Insere um aluno no final da fila
	 * 
	 * @param aluno
	 * 		Aluno a ser inserido
	 */
	public void insere(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	/**
	 * Remove um aluno do inicio da fila
	 * 
	 * @return
	 * 		Aluno removido
	 */
	public Aluno remove() {
		return this.alunos.remove(0);
	}
	
	/**
	 * Verifica se a fila está vazia
	 * 
	 * @return
	 * 
	 */
	public boolean vazia() {
		return this.alunos.size() == 0;
	}
}

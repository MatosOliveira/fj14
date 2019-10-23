/**
 * 
 */
package br.com.caelum.ed;

/**
 * Classe para armazenas as informações de um Aluno
 * 
 * @author Matos
 *
 */
public class Aluno {

	private String nome;

	/**
	 * Obtem o nome do aluno
	 * 
	 * @return 
	 * 		Nome do Aluno 
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do Aluno
	 * 
	 * @param 
	 * 		Nome a ser alterado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aluno [nome=" + this.nome + "]";
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}

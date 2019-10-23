/**
 * 
 */
package br.com.caelum.ed;

/**
 * Contem as informa��es de um carro
 * 
 * @author Matos
 *
 */
public class Carro {

	private String nome;
	
	public Carro(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo para impressao das informa��es do carro
	 */
	@Override
	public String toString() {
		return "Carro: " + this.getNome();
	}
	
	
}

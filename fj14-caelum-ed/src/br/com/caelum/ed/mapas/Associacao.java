/**
 * 
 */
package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

/**
 * Classe para modelar o relacionamento entre as chaves e os valores do Mapa
 * 
 * @author Matos
 *
 */
public class Associacao {

	private String placa;
	private Carro carro;
	
	public Associacao(String placa, Carro carro) {
		this.placa = placa;
		this.carro = carro;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @return the carro
	 */
	public Carro getCarro() {
		return carro;
	}
	
	
}

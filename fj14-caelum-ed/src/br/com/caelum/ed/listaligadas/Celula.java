/**
 * 
 */
package br.com.caelum.ed.listaligadas;

/**
 * Classe que contem as informacoes das referencias para lista
 * 
 * @author Matos
 *
 */
public class Celula {

	private Celula proxima;
	private Celula anterior;
	private Object elemento;
	
	/**
	 * Construtor da classe
	 * 
	 * @param proxima
	 * 		Proxima referencia
	 * @param elemento
	 * 		Elemento a ser inserido
	 */
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	/**
	 * Construtor da classe
	 * 
	 * @param elemento
	 * 		Elemento a ser inserido
	 */
	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	/**
	 * @return the proxima
	 */
	public Celula getProxima() {
		return proxima;
	}

	/**
	 * @param proxima the proxima to set
	 */
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	/**
	 * @return the anterior
	 */
	public Celula getAnterior() {
		return anterior;
	}

	/**
	 * @param anterior the anterior to set
	 */
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	/**
	 * @return the elemento
	 */
	public Object getElemento() {
		return elemento;
	}
	
	
	
}

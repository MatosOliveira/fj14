/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.Carro;
import br.com.caelum.ed.mapas.MapaListas;

/**
 * Classe para teste dos Mapas
 * 
 * @author Matos
 *
 */
public class TesteTempoMapaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MapaListas mapaLista = new MapaListas();
		int numeroDeElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.adiciona("" + i, new Carro("c" + i));
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.pega("" + i);
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.contemChave("" + i);
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.remove("" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio)/1000.0);
	}

}

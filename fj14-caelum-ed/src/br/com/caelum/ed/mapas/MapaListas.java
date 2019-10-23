/**
 * 
 */
package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.ed.Carro;

/**
 * Classe que implementa mapas com utilizacao de listas
 * 
 * @author Matos
 *
 */
public class MapaListas {

	private List<Associacao> associacoes = new ArrayList<Associacao>();
	
	/**
	 * Adiciona informações do veiculo
	 * 
	 * @param placa
	 * 		Placa do carro
	 * @param carro
	 * 		Outras informações
	 */
	public void adiciona(String placa, Carro carro) {
		if (!this.contemChave(placa)) {
			Associacao associacao = new Associacao(placa, carro);
			this.associacoes.add(associacao);
		}
	}
	
	/**
	 * Obtem informacões do carro inserido atraves da placa informada
	 * 
	 * @param placa
	 * 		Placa informada
	 * @return
	 */
	public Carro pega(String placa) {
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return associacao.getCarro();
			}
		}
		
		throw new IllegalArgumentException("chave não existe");
		
	}
	
	/**
	 * Remove o veiculo com base na placa informada
	 * 
	 * @param placa
	 * 		Placa informada
	 */
	public void remove(String placa) {
		if (this.contemChave(placa)) {
			for (int i = 0; i < this.associacoes.size(); i++) {
				Associacao associacao = this.associacoes.get(i);
				
				if (placa.equals(associacao.getPlaca())) {
					this.associacoes.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("chave não existe");
		}
	}
	
	/**
	 * Verifica se a placa ja existe 
	 * 
	 * @param placa
	 * 		Placa informada
	 * @return
	 */
	public boolean contemChave(String placa) {
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				return true;
			}
		}
		return false;
	}
	
	
}

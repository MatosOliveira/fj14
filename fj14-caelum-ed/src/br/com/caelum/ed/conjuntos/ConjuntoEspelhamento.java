/**
 * 
 */
package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe para implementar Conjunto utilizando a técnica de Espalhamento
 * 
 * @author Matos
 *
 */
public class ConjuntoEspelhamento {

	private List<List<String>> tabela = new ArrayList<List<String>>();
	
	private int tamanho = 0;
	
	/**
	 * Construtor da classe para armazenar a posicao de cada letra
	 */
	public ConjuntoEspelhamento() {
		for(int i = 0; i < 26; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	/**
	 * Calcula o indice da tabela para a palavra
	 * 
	 * @param palavra
	 * 		Palavra pesquisada
	 * @return
	 * 		Indice da tabela
	 */
	private int calculaIndiceDaTabela(String palavra) {
		//return palavra.toLowerCase().charAt(0) % 26;
		int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra);
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % tabela.size();
	}
	
	/**
	 * Adiciona a palavra, porém, verifica se a mesma já existe
	 * 
	 * @param palavra
	 * 		Palavra a ser inserida
	 */
	public void adiciona(String palavra) {
		if(!this.contem(palavra)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}
	
	/**
	 * Exibe todas as palavras inseridas
	 * 
	 * @return
	 * 		Lista de palavras
	 */
	public List<String> pegaTodas(){
		List<String> palavras = new ArrayList<String>();
		
		for(int i = 0; i < this.tabela.size(); i++) {
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}

	/**
	 * Verifica se a palavra já existe
	 * 
	 * @param palavra
	 *
	 * @return
	 */
	public boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}
	
	/**
	 * Remove a palavra inserida
	 * 
	 * @param palavra
	 * 		
	 */
	public void remove(String palavra) {
		if (this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
			this.verificaCarga();
		}
	}
	
	/**
	 * Retorna o tamanho da tabela
	 * 
	 * @return
	 */
	public int tamanho() {
		return this.tamanho;
	}
	
	/**
	 * Analisar uma dada palavra e gerar um código genérico
	 * 
	 * @param palavra
	 * 
	 * @return
	 */
	private int calculaCodigoDeEspalhamento(String palavra){
		int codigo = 1;
		for (int i = 0; i < palavra.length(); i++) {
			codigo = 31 * codigo + palavra.charAt(i);
		}
		
		return codigo;
	}
	
	/**
	 * Imprime o estado da Tabela
	 */
	public void imprimeTabela(){
		for (List<String> lista : this.tabela) {
			System.out.print("[");
			
			for (int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			
			System.out.println("]");
		}
		
	}
	
	/**
	 * Redimensiona o tamanho da tabela
	 * 
	 * @param novaCapacidade
	 */
	private void redimensionaTabela(int novaCapacidade) {
		List<String> palavras = this.pegaTodas();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<String>());
		}
		
		for (String palavra : palavras) {
			this.adiciona(palavra);
		}
	}
	
	/**
	 * Verifica se a carga está acima ou abaixo do aceitável. 
	 * Caso estiver, redimensionamos adequadamente
	 * 
	 */
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}	

}

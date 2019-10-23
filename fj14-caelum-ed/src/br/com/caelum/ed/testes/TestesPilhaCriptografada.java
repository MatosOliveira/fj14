/**
 * 
 */
package br.com.caelum.ed.testes;

import br.com.caelum.ed.pilhas.PilhaCriptografada;

/**
 * @author Matos
 *
 */
public class TestesPilhaCriptografada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String mensagem = "amU megasnem laicnedifnoc";
		
		PilhaCriptografada<String> pilhaDeString = new PilhaCriptografada<String>();
		
		//Criptografa
		for(int i = 0; i < mensagem.length(); i++) {
			pilhaDeString.insere(mensagem.charAt(i));
		}
		
		//Descriptografa
		if(!pilhaDeString.vazia()) {
			for(int i = mensagem.length() - 1; i >= 0; i--) {
				System.out.print(pilhaDeString.remove(mensagem.charAt(i)));
			}
		}

	}

}

package br.com.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula11 {
	
	public static void main(String[] args) {
		
		ArrayList<String> contato = new ArrayList<String>();
		
		contato.add("nome");
		contato.add("sobreNome");
		System.out.println(contato);
		
		contato.indexOf("nome");
		System.out.println(contato);
		
		contato.remove("nome");
		System.out.println(contato);
		
		contato.clear();
		System.out.println(contato);
	}

}

package br.com.estruturadados.vetor.teste;

import br.com.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1"); //posição 0
		vetor.adiciona("elemento 2"); //posição 1
		vetor.adiciona("elemento 3"); //posição 2

		System.out.println(vetor.busca(1));

	}

}

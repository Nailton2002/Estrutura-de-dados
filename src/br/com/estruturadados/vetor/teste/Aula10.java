package br.com.estruturadados.vetor.teste;

import br.com.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "nailton1@email.com");
		Contato c2 = new Contato("Contato 2", "2234-5678", "nailton2@email.com");
		Contato c3 = new Contato("Contato 3", "3234-5678", "nailton3@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c3);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elementos não existe no vetor");
		}
		
		System.out.println(vetor);
	}
}

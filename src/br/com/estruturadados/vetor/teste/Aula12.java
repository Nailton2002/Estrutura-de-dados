package br.com.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);

		arrayList.add(1, "B");
		System.out.println(arrayList);

		arrayList.add(3, "D");
		System.out.println(arrayList);
		// O METODO CONTAINS É SIMILAR AO METODO BUSCAR, SÓ QUE RETORNA UM BOOLEAN
		boolean existe = arrayList.contains("A");
		if (existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}

		// O METODO indexOf É SIMILAR AO METODO BUSCAR
		int pos = arrayList.indexOf("B");
		if (pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		//BUSCAR POS POSIÇÃO TAMBEM
		System.out.println(arrayList.get(2));
		
		//REMOVENDO POR POSIÇÃO
		arrayList.remove(0);
		arrayList.remove("B");
		System.out.println(arrayList);
		
		//VENDO O TAMANHO NO ARRAYLIST
		System.out.println(arrayList.size());
	}

}

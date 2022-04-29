package br.com.estruturadados.fila;

import java.util.LinkedList;
import java.util.Queue;

//COMO A FILA NO JAVA É UMA INTERFACE, CHAMAREMO QUALQUER UMA DAS CLASSES QUE IMPLEMEMNTA ESTA INTERFACE
//PRIMEIRO A ENTRA É O PRIMEIRO A SAIR
//ENFILEIRAR ADICIONANDO, ESPIAR VISUALIZANDO, DESENFILEIRAR REMOVENDO.
public class Fila {

	public static void main(String[] args) {

		// OS MÉTODOS QUE ESTA NA INTERFA QUEUE SÃO OS QUE VÃO FICAR DISPONIVEIS PARA SEREM CHAMADOS
		Queue<Integer> fila = new LinkedList<>();

		fila.add(1);
		fila.add(2);
		fila.add(3);

		System.out.println(fila);

		// METODO DE ESPIAR, VISUALIZAR
		System.out.println(fila.remove());

		// METODO PARA DESENFILERAR
		System.out.println(fila.peek());

	}

}

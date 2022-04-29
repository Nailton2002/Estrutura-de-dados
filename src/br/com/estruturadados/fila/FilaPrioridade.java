package br.com.estruturadados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class FilaPrioridade {

	public static void main(String[] args) {

		Queue<Integer> filaComPrioridade =new PriorityQueue<Integer>();
		
		filaComPrioridade.add(2);
		filaComPrioridade.add(5);
		System.out.println(filaComPrioridade);
		
		filaComPrioridade.add(1);
		filaComPrioridade.add(3);
		System.out.println(filaComPrioridade);
		
		
	}

}

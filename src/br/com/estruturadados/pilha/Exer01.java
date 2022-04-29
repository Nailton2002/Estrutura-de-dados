package br.com.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exer01 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		for (int i=1; i<=10; i++){
			System.out.println("Digite um número: ");
			int num = scan.nextInt();
			if (num % 2 == 0) {
				System.out.println("Empilhando o número " + num);
				stack.push(num);
			} else {
				Integer desempilhando = stack.pop();
				if (desempilhando == null) {
					System.out.println("Pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando um numero da pilha " + desempilhando);
				}
			}
		}
		System.out.println("Todos os números foram lidos, desempilhando números da pilha");

		while (!stack.isEmpty()) {
			System.out.println("Desempilhando um numero da pilha ");
		}

		System.out.println("Todos os elementos foram desempilhados!");
	}
}

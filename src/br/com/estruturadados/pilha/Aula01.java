package br.com.estruturadados.pilha;

import java.util.Stack;

//O ÚLTIMO ELEMENTO A ENTRAR É O PRIMEIRO A SAIR.
//Last In First Out
public class Aula01 {
	
	public static void main(String[] args) {
		//CLASSE PILHA NO JAVA
		Stack<Integer> stack = new Stack<Integer>();
		
		//ESTA VAZIO
		System.out.println(stack.isEmpty());
		
		//EMPILHANDO
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		
		//TAMANHO DA PILHA
		System.out.println("Tamanho da pilha " + stack.size());
		
		//METODO ESPIA DA CLASSE PILHA
		System.out.println(stack.peek());
		
		//METODO PARA REMOVER DESEMPILHA DA CLASSE PILHA
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		
	}

}

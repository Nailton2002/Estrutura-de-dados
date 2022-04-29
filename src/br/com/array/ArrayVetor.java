package br.com.array;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		String posicoes = JOptionPane.showInputDialog("Qunatas posiçoes o arrya deve ter?");

		double[] nota = new double[Integer.parseInt(posicoes)];

		for (int i = 0; i < nota.length; i++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + i);
			nota[i] = Double.valueOf(valor);
		}

		for (int i = 0; i < nota.length; i++) {
			System.out.println("Nota " + (i + 1) + " é = " + nota[i]);
		}

	}

}

package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("Digite seu nome");
		String valor2 = JOptionPane.showInputDialog(valor1+": Digite seu peso");
		String valor3 = JOptionPane.showInputDialog(valor1+": Digite sua altura");
		
		double a = Double.parseDouble(valor2);
		double b = Double.parseDouble(valor3);
		
		double resultado = a / (b * b);
		
		System.out.println(valor1 +" Seu IMC é de: " + resultado);
		
	}
}

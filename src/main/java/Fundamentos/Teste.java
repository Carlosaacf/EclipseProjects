package Fundamentos;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog( " Login ");
		String valor2 = JOptionPane.showInputDialog(" Senha ");
	
		System.out.printf( valor1, valor2);
	}
}

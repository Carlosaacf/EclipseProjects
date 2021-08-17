package Estruturas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa dizer "
					+ "\nas palavras magicas");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
			
		}
		while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
		
	}
}

package Estruturas;

import java.util.Scanner;

public class DesafioEstruturasDeControle2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o ano ");
		int ano = scanner.nextInt();
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println(ano + " � um ano bissexto");
		}
		else {
			System.out.println(ano + " N�o � um ano bissexto");
		}
		scanner.close();
		
	}
}

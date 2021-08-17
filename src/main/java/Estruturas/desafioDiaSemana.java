package Estruturas;

import java.util.Scanner;

public class desafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");

		String resposta = entrada.next();

		if (resposta.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (resposta.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (resposta.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (resposta.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (resposta.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (resposta.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else {
			System.out.println(7);
		}
		entrada.close();

	}
}

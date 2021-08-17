package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o Primeiro Salario");
		String valor1 = entrada.nextLine().replace(",", ".");

		System.out.println("Informe o Segundo Salario");
		String valor2 = entrada.nextLine().replace(",", ".");

		System.out.println("Informe o Terceiro Salario");
		String valor3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;

		System.out.println("A media dos salarios é R$" + media);

		entrada.close();

	}
}

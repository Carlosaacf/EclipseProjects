package Estruturas;

import java.util.Scanner;

public class DesafioEstruturasDeControle {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite o numero de entrada");
	int a = entrada.nextInt();
	
	if (a<=10 && a >0 && a % 2 ==0){
	System.out.println(a + " está entre 0 e 10 é um numero par!");
}
	else {
		System.out.println(a + " está entre 0 e 10 e é um numero impar!");
	}
	
	entrada.close();
	
}	
}

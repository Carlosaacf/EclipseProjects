package Estruturas;

import java.util.Scanner;

public class DesafioEstruturasDeControle {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite o numero de entrada");
	int a = entrada.nextInt();
	
	if (a<=10 && a >0 && a % 2 ==0){
	System.out.println(a + " est� entre 0 e 10 � um numero par!");
}
	else {
		System.out.println(a + " est� entre 0 e 10 e � um numero impar!");
	}
	
	entrada.close();
	
}	
}

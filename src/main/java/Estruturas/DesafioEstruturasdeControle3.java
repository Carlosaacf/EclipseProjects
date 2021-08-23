package Estruturas;

import java.util.Scanner;

public class DesafioEstruturasdeControle3 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite a nota 1");
	int nota1 = entrada.nextInt();
	
	Scanner entrada2 = new Scanner (System.in);
	System.out.println("Digite a nota 2");
	int nota2 = entrada2.nextInt();
	
	double media = (nota1+nota2)/2;
	
	if (media >=7)
	System.out.println("Parabéns, Aluno Aprovado!");
	
	else if (media <= 6.9 && media > 4)
		
System.out.println("Aluno em Recuperação");
	
else  System.out.println("Aluno Reprovado!");

	entrada.close();
	entrada2.close();
	
}
}

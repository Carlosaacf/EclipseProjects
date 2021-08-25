package Classe;

import com.sun.org.apache.bcel.internal.generic.D2F;

public class DataTeste {

	public static void main(String[] args) {
		
	Data d1 = new Data();
	
	d1.dia = 01;
	d1.mes = "Maio";
	d1.ano = 1988;
	
	var d2 = new Data();
	
	d2.dia = 01;
	d2.mes = "Agosto";
	d2.ano = 1990;
	
	System.out.println("Eu Nasci em " + d1.dia + " de " + d1.mes + " de " + d1.ano);
	System.out.println("Eu Nasci em " + d2.dia + " de " + d2.mes + " de " + d2.ano);
	}
}

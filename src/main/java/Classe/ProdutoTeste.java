package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.precoComDesconto();

		Produto.desconto = 0.30;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.precoComDesconto();

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto();
		double precofinal2 = p2.precoComDesconto();
		
		System.out.printf("o Preco do " + p1.nome +" � R$ %.2f", precoFinal1);
		System.out.printf("\n"+ "o Preco do " + p2.nome +" � R$ %.2f", precofinal2 );
		
		System.out.println("Ola mundo");
	}
}

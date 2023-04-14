
public class Principal7Produto {
	public static void main(String[] args) {
		
		Preco preco = new Preco();
		preco.valorCustos = 140.0;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20.0, 15.0);
		
		System.out.println("Valor de custo: " + preco.valorCustos);
		System.out.println("Valor do imposto: " + preco.valorImpostos);
		System.out.println("Valor de lucro: " + preco.valorLucro);
		System.out.println("Valor da venda: " + preco.precoVenda);
	}

}

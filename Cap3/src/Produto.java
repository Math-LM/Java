
public class Produto {
	
	void definirPreco(Preco preco, Double percentualImpostos, Double margemLucro) {
		
		preco.valorImpostos = preco.valorCustos
		   * (percentualImpostos / 100);
		preco.valorLucro = preco.valorCustos *(margemLucro / 100);
		preco.precoVenda = preco.valorCustos
				+ preco.valorImpostos + preco.valorLucro;
	}
}
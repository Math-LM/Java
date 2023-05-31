
public class testeArreyComCarro {
	public static void main(String[] args) {
		
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro(); //declarando o objeto carro carro na posição 0
		carros[0].anoDeFabricacao = 2011; // começa a deficnir as propriedade do carro na posição 0
		carros[0].cor = "azul";
		System.out.println("Ano fabricação: " + carros[0].anoDeFabricacao);
		System.out.println("Ano fabricação: " + carros[0].cor);
		
	}
}
 
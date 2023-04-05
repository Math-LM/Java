
public class Principal {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();//chamando a classe
		
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.anoDeFabricacao = 2012;
		meuCarro.cor = "verde";
		
		Carro seuCarro = new Carro();
		
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoDeFabricacao = 2006;
		seuCarro.cor = "prata";
		
		System.out.println("Meu carro");
		System.out.println("--------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoDeFabricacao);
		
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("---------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoDeFabricacao);
		
		
		
	}
}

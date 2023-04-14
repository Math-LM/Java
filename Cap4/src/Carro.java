
public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean bioCombustivel;
	
	Proprietario dono;
	
	void ligar() {
		if(modelo == null) {
			return;
		}
		
		  System.out.println("Ligando o carro: " + modelo); 
	}
}

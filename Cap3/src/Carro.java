
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
	}/*Quando temos um void significa que não retorna nada
	mas podemos bloquear o null que irá aparecer*/
}


public class Principal5Metodo {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.modelo = "palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
	}
}

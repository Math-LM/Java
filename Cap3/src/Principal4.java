
public class Principal4 {
	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Matheus";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "civic";
		
		meuCarro.dono = dono1;
		seuCarro.dono = dono1;
		
		System.out.println("Antes da mudança");
		System.out.println("meuCarro.dono.nome: "+meuCarro.dono.nome);
		System.out.println("seuCarro.dono.nome: "+seuCarro.dono.nome);
		System.out.println("dono1.nome: " + dono1.nome);

		
		meuCarro.dono.nome = "Daniel";
		
		System.out.println("Depois da mudança");
		
		System.out.println("meuCarro.dono.nome: "+meuCarro.dono.nome);
		System.out.println("seuCarro.dono.nome: "+seuCarro.dono.nome);
		System.out.println("dono1.nome: " + dono1.nome);

		
	}

}

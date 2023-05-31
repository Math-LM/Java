
public class Principal2 {
	public static void main(String[] args) {
		
		Proprietario dono1 = new Proprietario();
		dono1.nome = "MAtheus";
		dono1.cpf = "1231231312312";
		dono1.idade = 34;
		dono1.logradouro = "Rua João Pinheiro, 10";
		dono1.bairro = "Vila Nova";
		dono1.cidade = "São Paulo";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2012;
		meuCarro.cor = "verde";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = dono1;
	}
}

package Cap3Exercicio;

public class Passeio {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Maria";
		
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Bidu";
		p1.cachorro.raca = "Viralata";
		p1.cachorro.sexo = 'M';
		p1.cachorro.idade = 2;
		
		Caminhada c = new Caminhada();
		
		c.andar(p1);
	}

}

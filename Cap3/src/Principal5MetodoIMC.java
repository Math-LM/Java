
public class Principal5MetodoIMC {
	public static void main(String[] args) {
		Paciente2 p = new Paciente2();
		p.peso = 100;
		p.altura = 1.65;
		
		IMC imc = p.calcularIndiceDeMAssaCorpora();
		/*O método está retornando um obj */
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
		
	}

}

import java.util.Scanner;

public class calculadoraProfessor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o raio do circulo: ");
		Double raio = scanner.nextDouble();
				
		Double pi = 3.14;
		
		double calculoAreaDoCirculo = (raio * raio) * pi;
		
		Integer clculoSemAreaDecimal = (int)calculoAreaDoCirculo;
		
		System.out.println("Área de um círculo a partir do raio: " + calculoAreaDoCirculo);
		System.out.println("Área de um círculo a partir do raio: " + clculoSemAreaDecimal);
		
	}

}

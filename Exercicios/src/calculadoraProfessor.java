import java.util.Scanner;

public class calculadoraProfessor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Raio do quadrado: ");
		double raio = scanner.nextDouble();
		
		double pi = 3.14;
		
		double area = (raio * raio) * pi;
		
		int areaCirculo = (int)area;
				
		System.out.println("Resultado: " + area);
		System.out.println("Resultado sem casas decimais: " + areaCirculo);
		
	}

}

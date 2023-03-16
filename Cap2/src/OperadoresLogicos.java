import java.util.Scanner;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("Peso: ");
		int peso = scanner.nextInt();
		
		System.out.print("Altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Sexo (1 para 'M' ou 2 para 'F'): ");
		char sexo = scanner.nextShort() == 1?'M' : 'F';
		
		double imc = peso/ (altura * altura);
		
		if ((sexo =='F' && imc < 19.1) || (sexo =='M' && imc < 20.7)){
			System.out.println("Abaixo do peso.");
		}else if ((sexo =='F' && imc < 25.8) || (sexo =='M' && imc < 26.8)){
			System.out.println("Peso ideal");
		}else if ((sexo =='F' && imc > 27.3) || (sexo =='M' && imc > 27.8)) {
			System.out.println("Um pouco acima do peso");
		}
		
	}

}

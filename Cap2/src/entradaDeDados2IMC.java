import java.util.Scanner;

public class entradaDeDados2IMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Peso: ");
		int peso = scanner.nextInt();
		
		System.out.print("Altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso/ (altura * altura);
		
		System.out.println("O IMC de " + nome +": " + imc );
	}
}

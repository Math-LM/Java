import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Peso: ");
		int peso = scanner.nextInt();
		
		System.out.print("Altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso/ (altura * altura);
		
		System.out.println("O IMC de " + nome +" é: " + imc );
		
	 	if(imc < 18.5) {
			System.out.println("Abaixo do peso ideal."); 
		}else if(imc < 25){
			System.out.println("Peso ideal!");
		}else if(imc < 30) {
			System.out.println("Está acima do peso.");
		}else if(imc < 40) {
			System.out.println("Obesidade grau 1 ou 2.");
		}else {
			System.out.println("Obesidade grau 3");
		}
	}
}

import java.util.Scanner;

public class Escopo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Pode dirigir ou não.");
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeDirigir = idade >= 18;
		String nomePai = "";
		
		if(!podeDirigir) {
			System.out.print("nome do seu pai: ");
			
			nomePai = scanner.next();
		}
		
		
		if(podeDirigir) {
			System.out.println("Pode dirigir!");
		} else {
			System.out.println("Não possui idade suficiente para"
					+ " poder dirigir. Seu pai, " + nomePai + ",pode ser preso.");
		}
		
		
	}
}

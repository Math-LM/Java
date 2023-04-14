import java.util.Scanner;

public class EstruturaDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.println("Digite 0 para sair ou qualqer numero para somar: ");
			valor = scanner.nextInt();
			
			soma += valor;
			
			System.out.println(" ");
			System.out.println("Soma: " + soma);
			
		}while(valor !=0);
		
	}

}

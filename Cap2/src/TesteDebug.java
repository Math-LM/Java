import java.util.Scanner;

public class TesteDebug {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		Integer divisor = scanner.nextInt();
		
		for(int i = 100; i <= 120; i++) {
			if(i % divisor == 0) {
				
				System.out.println(i);
				continue; 
			}
		}
		
		System.out.println("Fim do programa");
		
		scanner.close();
	}
}

import java.util.Scanner;

public class ContinueBreak {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite um numero: ");
	Integer divisor = scanner.nextInt();
	
	
	for(int i = 100; i <= 120; i++) {
		if(i % divisor == 0) {
			System.out.println(i);
			continue; //Irá continuar se o resultado for 0, e quando não encontrar um divisor irá sair do laço
		}
	
	}
	
	System.out.println("Fim do programa");
}

}

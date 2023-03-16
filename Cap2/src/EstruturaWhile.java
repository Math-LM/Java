import java.util.Scanner;

public class EstruturaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o numero inicial: ");
		int numeroInicial = scanner.nextInt();
		
		System.out.print("Digite o numero final: ");
		int numeroFinal = scanner.nextInt();
		
		int numeroAtual = numeroInicial;
		
		//         1      <=      5
		while(numeroAtual <= numeroFinal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
	}

}

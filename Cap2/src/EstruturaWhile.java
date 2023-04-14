import java.util.Scanner;

public class EstruturaWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		int numeroInicial = 5;
		
		
		int numeroFinal = 10;
		
		
		//         1      <=      5
		while(numeroInicial <= numeroFinal) {
			System.out.println(numeroInicial);
			++numeroInicial;
		}
	}

}

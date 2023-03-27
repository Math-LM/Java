import java.util.Scanner;

public class EstruturaFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ultimo numero: ");
		int numeroFinal = scanner.nextInt();
		
		//for(indicação; condição; incremento)
		for(int i = 0; i<=numeroFinal; ++i){
			System.out.println(i);
		}
	}

}

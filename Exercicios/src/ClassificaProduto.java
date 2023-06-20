import java.util.Scanner;

public class ClassificaProduto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int codigoProduto = 0;
		
		do {
			System.out.println("Codigo do produto: ");
			codigoProduto = scanner.nextInt();
			
			String corredor = (codigoProduto % 2 ==0) ? "direita" : "esquerda";
			
			for(int i = 8; i >= 1; i--) {
				if(codigoProduto % i ==0) {
				System.out.println("O produto " + codigoProduto 
		+ " está no corredor da " + corredor + ", na gaveta " + i);
				
				break;
				}
			}
			
			
		}while(codigoProduto !=0);
		
		scanner.close();
	}
}

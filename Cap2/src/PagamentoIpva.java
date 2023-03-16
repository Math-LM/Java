import java.util.Scanner;

public class PagamentoIpva {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o final da placa: ");
		int finalPlaca = scanner.nextInt();
		
		switch (finalPlaca) {
		
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
			break;
		case 2:
			System.out.println("Vencimento dia 12 de janeiro");
			break;
		case 3: 
			System.out.println("Vencimento dia 13 de janeiro");
			break;
		default:
			System.out.println("Opção não existe no momento");
		}
	}

}

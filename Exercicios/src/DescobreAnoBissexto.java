import java.util.Scanner;

public class DescobreAnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Descubra se o ano é bissesto!");
		
		System.out.print("Escreva um ano: ");
		Integer ano = scanner.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissesto");
		}
		else if( ano % 4 ==0) {
			if(ano % 100 !=0) {
				System.out.println("O ano " + ano + " é bissesto");
			}
			else {
				System.out.println("O ano " + ano + " não é bissesto");
			}
			
		}
		else {
			System.out.println("O ano " + ano + " não é bissesto");
		}
		
	}
}

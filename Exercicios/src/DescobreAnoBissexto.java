import java.util.Scanner;

public class DescobreAnoBissexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Descubra se o ano é bissexto!! ");
		
		System.out.println("Ano: ");
		int ano = scanner.nextInt();
		
		if(ano%400 ==0) {
			System.out.println("Esté é um ano bissexto!");
		}else if(ano%4 ==0) {
			if(ano%100 !=0) {
				System.out.println("Esté é um ano bissexto!");
			}
		}
		else {
			System.out.println("Não é um ano bissexto. ");
		}
	}
}

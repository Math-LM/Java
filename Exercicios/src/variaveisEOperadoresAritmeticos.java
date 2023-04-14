import java.util.Scanner;

public class variaveisEOperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;
		
		int mediaProduto = (preco1 + preco2 + preco3)/3;
		
		System.out.println("A média dos produtos: " + mediaProduto);
	}

}

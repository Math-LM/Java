import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		                    
		
		//                    booleana        valor caso verdadeiro         valor caso falto
		String indicacao = (idade>=18)    ?          "adulto"        :     "criança/adolecente";
		String indicacao2 = (idade>=18) ? "adulto" : (idade <= 12 ? "criança" : "adolecente");// Pode ser feito das duas formas.
		
		
		
		
		System.out.println("Resultado: " + indicacao);
	
	/* if (idade >=18){
	    indicacao = "adulto;"
	    } else {
	    indicacao = "crianca/adolecente"
	    }*/
	}
}

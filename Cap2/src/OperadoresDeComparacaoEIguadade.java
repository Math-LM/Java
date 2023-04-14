
public class OperadoresDeComparacaoEIguadade {
	public static void main(String[] args) {
		
		//Comparação: >(maior), >=(maior ou igual), <(menor), <=(menor ou igual)
		//Igualdade: == (igual), != (diferente) e .equal (numeros maiores que 128.
		
		int a = 10;
		int b = 5;
		int c = 20;
		
		Boolean maior = b > a;
		Boolean maiorOuIgual = b >= a;
		Boolean menor = a < b;
		Boolean menorOuIgual = a <= 10;
		Boolean igual = a == (c - a);
		Boolean diferente = a!=c;
		
		System.out.println("Maior: "+maior);
		System.out.println("Maior ou igual: "+maiorOuIgual);
		System.out.println("menor: "+menor);
		System.out.println("Menor ou igual: "+menorOuIgual);
		System.out.println("igual: "+ igual);
		System.out.println("Diferente: "+diferente);
		
		System.out.println("-----------------------------");
		
		Boolean bloqueado = true;
		
		bloqueado = !bloqueado;
		
		System.out.println(bloqueado);
		
	}

}

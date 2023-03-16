
public class OperadoresDeComparacaoEIguadade {
	public static void main(String[] args) {
		
		//Comparação: >(maior), >=(maior ou igual), <(menor), <=(menor ou igual)
		//Igualdade: == (igual), != (diferente) e .equal (numeros maiores que 128.
		
		int a = 10;
		int b = 5;
		int c = 3;
		
		Boolean maior = b > a;
		Boolean maiorOuIgual = b >= a;
		Boolean menor = a < b;
		Boolean menorOuIgual = a <= 10;
		Boolean igual = a ==b - c;
		Boolean diferente = a!=c;
		
		System.out.println(maior);
		System.out.println(maiorOuIgual);
		System.out.println(menor);
		System.out.println(menorOuIgual);
		System.out.println(igual);
		System.out.println(diferente);
		
		System.out.println("-----------------------------");
		
		Boolean bloqueado = true;
		
		bloqueado = !bloqueado;
		
		System.out.println(bloqueado);
		
	}

}

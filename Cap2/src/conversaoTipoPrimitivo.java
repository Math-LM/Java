
public class conversaoTipoPrimitivo {
	public static void main(String[] args) {
		
		System.out.println("Conversão de tipos primitivos");
		long x = 1235657376L;
		int y = (int) x;
		System.out.println(y);
		System.out.println("---------------------------");		
		//casting; pegar um numero de outra váriavel
		//Observar que cada váriavel numérica possui uma quantidade numérica definida, vc irá assumir o risco na digitação errada.
		
		int a = 10233123;
		long b = a;
		System.out.println(b);
		System.out.println("---------------------------");	
		
		
		double c = 20.5;
		float d = (float)c;
		System.out.println(d);
		System.out.println("---------------------------");
		
		float e = 1239.4f;
		double f = e;
		System.out.println(f);
        System.out.println("---------------------------");

		double largura = 100.40;
		int medida = (int) largura;
		System.out.println(medida);
		System.out.println("---------------------------");		
	}

}

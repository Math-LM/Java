
public class Wrapper {
	public static void main(String[] args) {
		
		//byte, short, int, long, float, double e char 
		
		int x =5; 
		Integer i = new Integer (5);
		
		byte y = i.byteValue();
	//	xxxValue();
		
		String valor = "15.5";
		
		Float v = new Float(valor); //conseguirmos converter um String para um float
		
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("27");
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos. ");
		
		
	try {	
		double custo = Double.parseDouble("vinte e tres reais e cinquenta centavos");
		System.out.println("Custo total: " + custo);
	} catch (NumberFormatException e) {
		System.err.println("Numero invalido para conversão.");
	}
	}

}

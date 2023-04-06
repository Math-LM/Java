
public class Principal5MetodoERetorno {
	public static void main(String[] args) {
		paciente p = new paciente();
		
		p.peso = 70.5;
		p.altura = 1.75;
		
		Double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do paciente: " + imcCalculado);
		
	}
}

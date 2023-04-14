
public class Principal6horasExtras {
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		
		Double salario = folha.calcularSalario(160, 12, 32.0, 40.0);
		
		System.out.println("Salário calculado: " + salario);
	}
}

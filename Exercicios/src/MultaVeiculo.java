import java.util.Scanner;

public class MultaVeiculo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Tipo de veiculo (1 para 'caminhao' e 2 para 'passeio'): ");
		char tipoVeiculo = scanner.nextShort() == 1? 'C' : 'P';
		
		System.out.print("Velocidade Máxima permitida: ");
		Integer velocidadeMaxima = scanner.nextInt();
		
		System.out.print("Velocidade do Veículo: ");
		Integer velocidadeVeiculo = scanner.nextInt();
		
		if((tipoVeiculo == 'C' && velocidadeVeiculo > velocidadeMaxima *1.05) 
				|| (tipoVeiculo == 'P' && velocidadeVeiculo > velocidadeMaxima *1.1 )){
			System.out.println("O seu veiculo foi multado.");
		}else {
			System.out.println("Está funcionando bem!");
		}
	}

}

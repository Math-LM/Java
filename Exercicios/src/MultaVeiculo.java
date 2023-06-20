import java.util.Scanner;

public class MultaVeiculo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Tipo do veículo. Se for um veículo de passeio"
+" digite '1', e se for um caminha digite '2': ");		
		char tipoVeiculo = scanner.nextShort() == 1? 'p' :'m';
		
		System.out.print("Velocidade permitida na via: ");
		double velocidade = scanner.nextDouble();
		
		System.out.println("Velocidade do veículo: ");
		double velocidadeVeiculo = scanner.nextDouble();
		
		if((tipoVeiculo == 'p' && velocidadeVeiculo > velocidade *1.1)
				|| (tipoVeiculo =='m' && velocidadeVeiculo > velocidade *1.05)) {
			System.out.println("Multado!");
		}else {
			System.out.println("Este veículo não deve ser multado.");
		}
		
		
	}

}

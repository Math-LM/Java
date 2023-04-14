
public class FolhaPagamento {
	
	//double calcularSalario(int, int, double, double) : Se chama assinatura do método.
	Double calcularSalario(Integer horasNormais, Integer horasExtras
			, Double valorHoraNormal, Double valorHoraExtra) {
		
		Double valorHorasNormais = horasNormais * valorHoraNormal;
		Double valorHorasExtra = horasExtras * valorHoraExtra;
		
		return valorHoraNormal + valorHorasExtra;
		
	} 

}

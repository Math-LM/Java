
public class Paciente2 {
	
	double peso;
	double altura;
	
	
	IMC calcularIndiceDeMAssaCorpora() {
		IMC imc = new IMC();
		
		Double indice = peso / (altura * altura);
		
		if (indice < 18.5) {
			imc.abaixoDoPesoIdeal = true;
		} else if (indice < 25) {
			imc.pesoIdeal=true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauObesidade = "Acima do peso";
			} else if (indice < 35) {
				imc.grauObesidade = "I";
			} else if (indice < 40) {
				imc.grauObesidade = "II";
			} else {
				imc.grauObesidade = "III";
			}
		}
		return imc;
	}
}

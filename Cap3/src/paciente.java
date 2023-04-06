
public class paciente {
	
	Double peso;
	Double altura;
	
	Double calcularIndiceDeMassaCorporal() {
		Double imc = peso/ (altura* altura);
		
		return imc; //Palavra reservada
	}

}

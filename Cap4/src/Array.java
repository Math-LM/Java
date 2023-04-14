
public class Array {
	public static void main(String[] args) {
		
		int[] notas = new int [4];
		notas[0] = 10;
		notas[1] = 6;
		notas[2] = 5;
		notas[3] = 9;
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		
		System.out.println("Tamanho do Array: " + notas.length);
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Posição {" + i + "] = " + notas[i]);
		}
	}
}

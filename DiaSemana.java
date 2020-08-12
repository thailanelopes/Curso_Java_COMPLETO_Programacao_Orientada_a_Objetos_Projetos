import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		String dia;
		
		if(n == 1) {
			dia = "Domingo";
			
		}else if(n == 2) {
			dia = "Segunda";
			
		}else if(n == 3) {
			dia = "Terca-Feira";
			
		}else if(n == 4) {
			dia = "Quarta-Feira";
			
		}else if(n == 5) {
			dia = "Quinta-Feira";
		}else if(n == 6) {
			dia = "Sexta-Feira";
			
		}else if(n == 7) {
			dia = "Sábado";
		}
		else {
			dia = "valor inválido";
		}
		System.out.println("Dia da semana: " + dia);
		
		
		teclado.close();
		
	}

}


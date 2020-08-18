import java.util.Locale;
import java.util.Scanner;

public class Celsiusequi {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		char resposta = 's';
		
		while(resposta != 'n') {
		System.out.print("Digite a temperatura em Celcius: ");
		double C = teclado.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		
		System.out.printf("O equivalente em Fahrenheit: %.1f\n", F);
		
		System.out.print("Deseja repetir a operação (s/n)? ");
		resposta = teclado.next().charAt(0);
		
		}
	
		
		
		
		teclado.close();

	}

}

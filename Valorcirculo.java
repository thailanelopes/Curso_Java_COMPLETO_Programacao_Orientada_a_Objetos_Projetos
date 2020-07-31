import java.util.Locale;
import java.util.Scanner;

public class Valorcirculo {

	public static void main(String[] args) {

		//variáveis
		double raio, area, pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		raio = teclado.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("area = %.4f\n", area);
		
		teclado.close();
		
		
	}

}

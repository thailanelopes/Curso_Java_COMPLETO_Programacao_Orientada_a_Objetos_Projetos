import java.util.Locale;
import java.util.Scanner;

public class Treinajava {

	public static void main(String[] args) {
	//variáveis
		String product1 = "computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		Scanner teclado = new Scanner(System.in);
		
		//saidas
		System.out.printf("%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
		System.out.printf("%.2f with eight decimal places: 53,23456700\n", measure);
		System.out.printf("Rounded: %.3f\n", measure);
		System.out.printf("US decimal point: %.3f", measure);
		
	Locale.setDefault(Locale.US); //usar as configurações de texto diferente da configurada no computador.
		
		
		teclado.close();
		
	}
 
}

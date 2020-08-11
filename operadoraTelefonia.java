import java.util.Locale;
import java.util.Scanner;

public class operadoraTelefonia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeMinuto = teclado.nextInt();
		double conta = 50.0;
		
		
		if(quantidadeMinuto > 100) {
			conta = conta + (quantidadeMinuto - 100) * 2.00;
		}
			System.out.printf("valor a pagar será = R$ %.2f\n", conta);
		
		
		
		teclado.close();
		
	}

}

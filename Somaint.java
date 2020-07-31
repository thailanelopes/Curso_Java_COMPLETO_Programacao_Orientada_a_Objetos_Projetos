import java.util.Scanner;

public class Somaint {

	public static void main(String[] args) {

		//variáveis
		int var1, var2, soma;
		
		
		//entradas
		Scanner teclado = new Scanner(System.in);
		var1 = teclado.nextInt();
		var2 = teclado.nextInt();
		
		
		//processamento
		soma = (var1 + var2);
		System.out.println("SOMA = " + soma);
		
		
		teclado.close();
	}

}

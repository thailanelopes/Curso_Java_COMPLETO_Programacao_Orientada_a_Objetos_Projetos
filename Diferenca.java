import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {

		int A, B, C, D, diferenca;
		
		Scanner teclado = new Scanner(System.in);
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		
		diferenca = (A*B-C*D);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		teclado.close();
		
	}

}

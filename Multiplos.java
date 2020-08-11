import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		int A, B;
		
		System.out.print("Informe o primeiro número: ");
		A = teclado.nextInt();
		System.out.println("Informe o segundo número: ");
		B = teclado.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		
		teclado.close();
	}

}

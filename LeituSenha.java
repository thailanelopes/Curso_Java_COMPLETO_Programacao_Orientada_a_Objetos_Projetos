import java.util.Scanner;

public class LeituSenha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int senha = teclado.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida!");
			senha = teclado.nextInt();
		}
		
		System.out.printf("Acesso Permitido");
		
		
		teclado.close();
	}

}

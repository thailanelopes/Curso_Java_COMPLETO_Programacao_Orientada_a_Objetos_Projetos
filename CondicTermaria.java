import java.util.Scanner;

public class CondicTermaria {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);

		teclado.close();
	}

}


Versão do programa utilizando a condição Termária:


import java.util.Scanner;

public class CondicTermaria {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		
		double preco = 34.5;
		double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05; // aqui foi aplicado a condição termária, onde conforme a condição, compara se é verdadeiro ou falso: desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		
		
		System.out.println(desconto);

		teclado.close();
	}

}

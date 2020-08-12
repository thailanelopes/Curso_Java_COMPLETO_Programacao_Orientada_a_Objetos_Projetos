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

VERSÃO DO PROGRAMA UTILIZANDO A ESTRUTURA SWITCH-CASE.
	
	import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) { //switch, O switch vai funcionar como um interruptor, pois dependendo da entrada que você der a ele, ele vai acionar somente certo(s) comando(s) dentre os que você disponibilizou.
		case 1:
			dia = "domingo";
			break;  //break, é obrigatorio quando se está utilizando a estrutura switch-case.
		case 2:
			dia = "segunda";
			break;
		case 3: //case, condição caso aconteça x então processar y.
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: //Se os valores determinados acima estiverem incorretos, o default processará a condição abaixo.
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}


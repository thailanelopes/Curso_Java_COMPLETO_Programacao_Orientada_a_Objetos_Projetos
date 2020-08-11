import java.util.Scanner;

public class Duracaojogo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Informe a hora Inicial:");
		horaInicial = teclado.nextInt();
		System.out.println("Informe a hora Final");
		horaFinal = teclado.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaFinal + horaInicial;
		}
		
		System.out.printf("O Jogo durou %d Horas", duracao);
		
		teclado.close();
	}

}

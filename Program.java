package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = teclado.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		teclado.close();
	}

}

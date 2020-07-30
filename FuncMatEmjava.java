import java.util.Locale;
import java.util.Scanner;

public class FuncMatEmjava {
public static void main(String[] args) {
	
	//variáveis
	double x = 3.0;
	double y = 4.0;
	double z = -5.0;
	double A, B, C;
	
	//Entradas/Saídas
	Locale.setDefault(Locale.US);
	Scanner teclado = new Scanner(System.in);
	
	A = Math.sqrt(x); //Math.sqrt(), função matemática em Java para receber a raiz quadrada. ex: A variável A recebe a raiz quadrada de x.
	B = Math.sqrt(y);
	C = Math.sqrt(25.0);
	System.out.println("Raiz quadrada de " + x + " = " + A);
	System.out.println("Raiz quadrada de " + y + " = " + B);
	System.out.println("Raiz quadrada de 25 = " + C);
	
	A = Math.pow(x, y); // Math.pow(), função matemática em Java para receber a número elevado a potência. ex: Variável A recebe o resultado de x elevado a y. 
	B = Math.pow(x, 2.0);
	C = Math.pow(5.0, 2.0);
	System.out.println(x + " elevado a " + y + " = " + A); //Para concatenar vários elementos em um mesmo comando de escrita (x + " elevado a " + y + " = " + A) (3.0 elevado a 4.0 = 81.0) resultado imprimido. Ou pode ser feito dessa forma usando o printf ("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda)
	System.out.println(x + " elevado ao quadrado = " + B);
	System.out.println("5 elevado ao quadrado = " + C);
	
	A = Math.abs(y); //Math.abs(), função matemática em Java para receber o valor absoluto de um número (o valor sem o negativo, caso tenha algum número negativo). ex: Variável A recebe o valor absoluto de x.
	B = Math.abs(z);
	System.out.println("Valor absoluto de " + y + " = " + A);
	System.out.println("Valor absoluto de " + z + " = " + B);
	
	teclado.close();
}
}

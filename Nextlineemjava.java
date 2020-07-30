import java.util.Scanner;

public class Nextlineemjava {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int x;
	String s1, s2, s3;
	
	
	x = sc.nextInt();
	sc.nextLine(); // é necessário fazer este nextLine extra, depois de qualquer outro tipo de dado diferente de String, pois quando for dado enter os outros dados serão considerados.
	s1 = sc.nextLine(); //O nextLine é utilizado para ler o texto inteiro inteiro digitado na linha. 
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	System.out.println("DADOS DIGITADOS:");
	System.out.println(x);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	sc.close();
	
}

}
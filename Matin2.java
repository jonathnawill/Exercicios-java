import java.util.Locale;
import java.util.Scanner;

public class Matin2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// linguagem de soma
		int a, b;
		System.out.println("Digite dois números para somar");
		a = sc.nextInt();
		b = sc.nextInt();
	
		System.out.println("Entrada 1: " + a);
		System.out.println("Entrada 2: " + b);
		int somapositiva = a + b;
		System.out.println("Soma = " + somapositiva);
		System.out.println();
		
		// linguagem de subtração
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Entrada 1: " + a);
		System.out.println("Entrada 2: " + b);
		int somanegativa = a + b;
		System.out.println("Subtração = " + somanegativa);
		System.out.println();
		
		//linguagem de resultado vazio
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Entrada 1: " + a);
		System.out.println("Entrada 2: " + b);
		int somavazia = a + b;
		System.out.println("Soma vazia:" + somavazia);
		
		sc.close();
		
		
		
		
		
		
		

	}

}

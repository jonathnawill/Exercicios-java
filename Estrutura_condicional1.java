import java.util.Scanner;

public class Estrutura_condicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Entrada;
		
		System.out.println("Digite um numero");
		
		Entrada = sc.nextInt();
		
		if (Entrada < 0) {
		   System.out.println("Negativo");
		   }
		else {
		     System.out.println("Não negativo");
		}
		 sc.close();
	}

}

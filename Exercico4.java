import java.util.Locale;
import java.util.Scanner;

public class Exercico4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo1, codigo2, numero1, numero2;
		
		Double V1, V2, Total;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		V1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		V2 = sc.nextDouble();
		
		Total = (numero1 * V1 + V2 * numero2);
		System.out.printf("Valor a pagar: R$ %.2f%n", Total);
		
		
	
		
	

	}

}

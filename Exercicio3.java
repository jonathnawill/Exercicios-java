import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
Scanner sc = new Scanner(System.in);
		
		double n, h, v,salary;
		
		n = sc.nextDouble();
		h = sc.nextDouble();
		v = sc.nextDouble();		
		
		salary = (h * v);
		System.out.println("Number = " + n);
		
		System.out.printf("Salary = U$ %.2f%n ", salary );
		
		sc.close();
	}

}

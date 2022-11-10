import java.util.Locale;
import java.util.Scanner;

public class Matin2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, a, pi = 3.14159;
		
		 r = sc.nextDouble();
		 
		double area = (pi * r *r);
		System.out.printf("A= %.4f%n", area);
		
		sc.close();
		
		
		
		
		
		
		
		

	}


}

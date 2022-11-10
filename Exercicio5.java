import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double a, b, c, Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangulo = a * c / 2;
		Circulo = 3.14159 * c * c;
		Trapezio = ( a + b ) * c / 2 ;
		Quadrado = b * b;
		Retangulo = a * b;
		
		System.out.printf("Triangulo: %.2f%n Circulo: %.2f%n "
				+ "Trapezio: %.2f%n "
				+ "Quadrado: %.2f%n Retangulo"
				+ ": %.2f%n ", Triangulo, Circulo, Trapezio, Quadrado, Retangulo);
		
		
		

	}

}

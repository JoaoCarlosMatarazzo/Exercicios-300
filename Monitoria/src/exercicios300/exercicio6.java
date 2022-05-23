package exercicios300;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int a, b, c;
		int aux = 0;
		System.out.println("Por favor, apresente um valor para A:");
		a=ler.nextInt();
		System.out.println("Por favor, apresente um valor para B:");
		b=ler.nextInt();
		System.out.println("Por favor, apresente um valor para C:");
		c=ler.nextInt();
		if (a > b) {
			 aux = a;
			 a = b;
			 b = a;
			}
		if (a > c) {
			 aux = a;
			 a = c;
			 c = aux;
			}
		if (b > c) {
			 aux = b;
			 b = c;
			 c = aux;
			}

	}

}

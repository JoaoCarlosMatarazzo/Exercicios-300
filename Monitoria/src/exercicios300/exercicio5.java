package exercicios300;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor;
		System.out.println("Por favor, apresente o valor para ser computado.");
		valor = entrada.nextDouble();
		if ((3<4) && ((5<=7 || 8==10 || 9>3) && !(4<5)) || (2>0)) {
			System.out.println("Legal, o valor foi aceito!");
		}
		else 
			System.out.println("Desculpe, Valor invalido.");

	}

}

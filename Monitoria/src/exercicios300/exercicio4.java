package exercicios300;
import java.util.Scanner;
public class exercicio4 {
	//Crie uma variável inteira contendo um número de segundos e imprima o 
	//número equivalente de horas, minutos e segundos.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int seg;
		System.out.println("Por favor, informe o tempo em segundos para ser convertido em minutos e horas:");
		seg = entrada.nextInt();
		int hor = seg / 3600;
		int min = seg / 60;
		System.out.print("O tempo total obtido foi de:");
		if (hor > 0 || min > 0 || seg > 0)
		    System.out.printf(" horas: "+ hor + " ;minutos: "+min+" ;segundos: "+seg);
		else if (min > 0 || seg > 0)
		    System.out.printf(" minutos "+min+" ;segundos: "+seg);
		else if (seg > 0)
		    System.out.printf(" segundos", seg);
		else
			System.out.println("Desculpe, este não é um valor aceitavel tente novamente.");
	}
}

package exercicios300;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		/* Verifique se um n�mero inteiro qualquer corresponde a um ano bissexto
		(anos bissextos s�o os m�ltiplos de 4 que n�o s�o m�ltiplos de 100) e ainda 
		os m�ltiplos de 400. Exemplo: 1996 e 2000 s�o bissextos, enquanto 1998 e 1900 s�o comuns.*/
		Scanner ler = new Scanner(System.in);
		int ano = 0;
		int i, j, k;
		i = ano % 4;
		j = ano % 400;
		k = ano % 100;
		System.out.println("Por favor, digite o ano a seguir para ser analisado:");
		ano = ler.nextInt();
		if(i == 0 &&  j == 0 )
			System.out.println("Show, este � um ano bissexto.");
		else if(k == 0)
			System.out.println("Desculpe, mas este n�o � um ano bissexto");
		else
			System.out.println("Desculpa, este ano tamb�m n�o � bissexto.");

	}

}

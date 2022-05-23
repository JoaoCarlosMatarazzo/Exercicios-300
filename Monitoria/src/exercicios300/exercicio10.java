package exercicios300;
import java.util.Scanner;
public class exercicio10 {

	public static void main(String[] args) {
		/* Verifique se um número inteiro qualquer corresponde a um ano bissexto
		(anos bissextos são os múltiplos de 4 que não são múltiplos de 100) e ainda 
		os múltiplos de 400. Exemplo: 1996 e 2000 são bissextos, enquanto 1998 e 1900 são comuns.*/
		Scanner ler = new Scanner(System.in);
		int ano = 0;
		int i, j, k;
		i = ano % 4;
		j = ano % 400;
		k = ano % 100;
		System.out.println("Por favor, digite o ano a seguir para ser analisado:");
		ano = ler.nextInt();
		if(i == 0 &&  j == 0 )
			System.out.println("Show, este é um ano bissexto.");
		else if(k == 0)
			System.out.println("Desculpe, mas este não é um ano bissexto");
		else
			System.out.println("Desculpa, este ano também não é bissexto.");

	}

}

package exercicios300;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		/* Crie tr�s vari�veis reais, defina valores quaisquer para elas e defina um
		c�digo que verifique se elas mesmas podem ser lados de um tri�ngulo
		(ou seja, nenhuma pode ser maior que a soma das outras duas).*/
		Scanner ler = new Scanner(System.in);
		double a, b, c; 
		System.out.println("Por favor, apresente o 1� valor para ser analisado:");
		a=ler.nextDouble();
		System.out.println("Por favor, apresente o 2� valor para ser analisado:");
		b=ler.nextDouble();
		System.out.println("Por favor, apresente o 3� valor para ser analisado:");
		c=ler.nextDouble();
		
		if(a > (b+c)) 
			System.out.println("Desculpe, com 1� valor digitado n�o � possivel formar um tri�ngulo.");
		else if(b > (c+a)) 
			System.out.println("Desculpe, com 2� valor digitado n�o � possivel formar um tri�ngulo.");
		else if(c > (a+b)) 
			System.out.println("Desculpe, com 3� valor digitado n�o � possivel formar um tri�ngulo.");
		else if(a < (b+c) && b<(a+c) && c<(a+b)) 
			System.out.println("Perfeito, com todos os valores digitados � possivel formar um tri�ngulo.");
		else
			System.out.println("Desculpe, nenhum dos valores colocados foram computados, tente novamente.");
		
	}

}

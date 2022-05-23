package exercicios300;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		/* Crie três variáveis reais, defina valores quaisquer para elas e defina um
		código que verifique se elas mesmas podem ser lados de um triângulo
		(ou seja, nenhuma pode ser maior que a soma das outras duas).*/
		Scanner ler = new Scanner(System.in);
		double a, b, c; 
		System.out.println("Por favor, apresente o 1º valor para ser analisado:");
		a=ler.nextDouble();
		System.out.println("Por favor, apresente o 2º valor para ser analisado:");
		b=ler.nextDouble();
		System.out.println("Por favor, apresente o 3º valor para ser analisado:");
		c=ler.nextDouble();
		
		if(a > (b+c)) 
			System.out.println("Desculpe, com 1º valor digitado não é possivel formar um triângulo.");
		else if(b > (c+a)) 
			System.out.println("Desculpe, com 2º valor digitado não é possivel formar um triângulo.");
		else if(c > (a+b)) 
			System.out.println("Desculpe, com 3º valor digitado não é possivel formar um triângulo.");
		else if(a < (b+c) && b<(a+c) && c<(a+b)) 
			System.out.println("Perfeito, com todos os valores digitados é possivel formar um triângulo.");
		else
			System.out.println("Desculpe, nenhum dos valores colocados foram computados, tente novamente.");
		
	}

}

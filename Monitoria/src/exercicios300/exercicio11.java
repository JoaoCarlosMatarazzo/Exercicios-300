package exercicios300;
import java.util.Scanner;
public class exercicio11 {

	public static void main(String[] args) {
		/*Crie dois n�meros inteiros e imprima:
a) a soma dos dois, caso ambos sejam �mpares;
b) o produto, caso sejam pares;
c) o n�mero �mpar, caso um seja par e outro n�o.*/
		Scanner ler = new Scanner(System.in);
		int a,b,impar, par, impar2, par2,soma,produto;
		System.out.println("Por favor, apresente o primeiro valor inteiro.");
		a = ler.nextInt();
		System.out.println("Por favor, apresente o segundo valor inteiro.");
		b = ler.nextInt();
		impar = a %3;
		par = a % 2;
		impar2 = b % 3;
		par2 = b % 2;
		soma = a+b;
		produto = a*b;
		if(impar == 0 && impar2 == 0) 
			System.out.printf("Certo, a soma entre os valores se d�o por:"+soma);
		else if(par==0 && par2==0)	
			System.out.printf("Certo, o produto entre os valores se d�o por:"+produto);
		else if (par == 0  && impar == 0 || par2 ==0 && impar2==0 )
			System.out.printf("Acredito que o texto desta quest�o esteja bugado na apostila digital professora, logo n�o sei o que colcoar aqui. kk");
		else
			System.out.printf("Valores inv�lidos.");

	}

}

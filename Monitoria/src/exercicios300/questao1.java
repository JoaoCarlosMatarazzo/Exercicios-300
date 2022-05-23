package exercicios300;

import java.util.Scanner;

public class questao1 {
public static void main(String[] args) {
float[] notas = new float[10];
float soma = 0;
float media = 0;
	Scanner ler = new Scanner(System.in);{
		for(int i=0; i<10; i++) {
		System.out.println("Por favor, informe a nota "+ (i+1) +":");
		notas[i] = ler.nextFloat();
		soma = soma + notas[i]; // ou soma += notas[i];
		}
		media = soma / 10;
		System.out.printf("O valor da média das notas da turma são: %.2f",media);
		}
	}
}
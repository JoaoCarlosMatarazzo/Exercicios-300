package exercicios300;
import java.util.Scanner;
public class exemplo12 {

	public static void main(String[] args) {
		/*Escreva um programa que verifique se uma nota é péssima (nota=1), ruim
	(2), regular (3), boa (4), ótima (5) ou nenhuma delas (nota inválida). Utilizamos 
	um WHILE para criarmos um laço (loop), ou seja, repetir um trecho
	de código algumas vezes enquanto uma determinada condição for verdadeira. 
	O exemplo abaixo imprime os cinco primeiros múltiplos de 9:
	int x = 1;
	while (x <=5) {
 	System.out.println(9*5);
 	X++;}
 	*/
		Scanner ler = new Scanner(System.in);
		int nota;
		int x =1;
		System.out.println("Por favor, apresente a nota do aluno arredondada de 1 a 5:");
		nota = ler.nextInt();
		while(x <=5) {
			if(nota==1) {
			System.out.println("PÉSSIMA");
			x++;
			}
			else if(nota==2) {
			System.out.println("RUIM");
			x++;
			}
			else if(nota==3) {
			System.out.println("REGULAR");
			x++;
			}
			else if(nota==4) {
			System.out.println("BOA");
			x++;
			}
			else if(nota==5) {
			System.out.println("ÓTIMA");
			x++;
			}
			else {
			System.out.println("Nota inválida.");
			x++;
			}
			
		}
	}

}

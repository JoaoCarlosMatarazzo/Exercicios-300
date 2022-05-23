package exercicios300;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		/*Crie uma variável contendo a idade de uma pessoa e verifique sua condição eleitoral:
•	 até 16 anos não pode votar;
•	 entre 16 e 18 anos ou mais que 65 é facultativo;
•	 entre 18 e 65 anos é obrigatório*/
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, apresente a sua idade:");
		idade = ler.nextInt();
		if(idade<=16)
			System.out.println("Desculpe, mas você ainda não possue idade para votar.");
		else if(idade<=18 || idade>16 && idade>65)
			System.out.println("Parabéns, você está classificado como facultativo.");
		else if(idade>18 && idade<65)
			System.out.println("Opa, você está classificado como, obrigatório a votar, SHOW!");

	}

}

package exercicios300;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		/*Crie uma vari�vel contendo a idade de uma pessoa e verifique sua condi��o eleitoral:
�	 at� 16 anos n�o pode votar;
�	 entre 16 e 18 anos ou mais que 65 � facultativo;
�	 entre 18 e 65 anos � obrigat�rio*/
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, apresente a sua idade:");
		idade = ler.nextInt();
		if(idade<=16)
			System.out.println("Desculpe, mas voc� ainda n�o possue idade para votar.");
		else if(idade<=18 || idade>16 && idade>65)
			System.out.println("Parab�ns, voc� est� classificado como facultativo.");
		else if(idade>18 && idade<65)
			System.out.println("Opa, voc� est� classificado como, obrigat�rio a votar, SHOW!");

	}

}

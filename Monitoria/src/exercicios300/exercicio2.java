package exercicios300;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		String[] meses = new String[12];
		int mes = 0;
		meses[0]="Janeiro";
		meses[1]="Fevereiro";
		meses[2]="Mar�o";
		meses[3]="Abril";
		meses[4]="Maio";
		meses[5]="Junho";
		meses[6]="Julho";
		meses[7]="Agosto";
		meses[8]="Setembro";
		meses[9]="Outubro";
		meses[10]="Novembro";
		meses[0]="Dezembro";
		Scanner ler = new Scanner(System.in);{
				System.out.println("Por favor, informe o m�s que voc� deseja:");
				mes = ler.nextInt();
				
				}
			
				System.out.println("O m�s que voc� deseja �: "+meses[mes-1]);
				}
			}
		
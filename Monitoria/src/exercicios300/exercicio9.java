package exercicios300;
import java.util.Scanner;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*Crie uma variável inteira contendo um dia do ano e outra contendo um
		mês. Verifique se elas formam uma data válida (considere que fevereiro
		sempre possui 28 dias).*/
		int dia, mes;
		System.out.println("Por favor, apresente o dia desejado:");
		dia = ler.nextInt();
		System.out.println("Por favor, apresente o mes desejado:");
		mes = ler.nextInt();
		switch(mes)
		{
		case 1:
		if(dia>31) 
			System.out.println("Desculpe, data inválida.");
		else if(dia<31)
			System.out.println("Legal, data analisada com sucesso.");
		else
			System.out.println("Desculpe, valor desconhecido.");
		break;
		case 2:
			if(dia>28) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<28)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
		break;
		case 3:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
		break;
		case 4:
			if(dia>30) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<30)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 5:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
			
		case 6:
			if(dia>30) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<30)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 7:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 8:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 9:
			if(dia>30) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<30)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 10:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 11:
			if(dia>30) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<30)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
		case 12:
			if(dia>31) 
				System.out.println("Desculpe, data inválida.");
			else if(dia<31)
				System.out.println("Legal, data analisada com sucesso.");
			else
				System.out.println("Desculpe, valor desconhecido.");
			break;
			
			
	}

}
}
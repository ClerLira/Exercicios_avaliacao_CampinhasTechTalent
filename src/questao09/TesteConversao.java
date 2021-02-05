package questao09;

import java.util.Scanner;

public class TesteConversao {

	public static void main(String[] args) {
		
			double num1, aux = 0;
			int conversao;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println 
			("Digite a unidade de medida: "
					+ "\n1-minutos para segundos, \n2-hora para minutos, "
					+ "\n3-dias para horas, \n4-semana para dias, "
					+ "\n5-mês para dias, \n6-ano para dias");
			conversao = scanner.nextInt();		
			
			System.out.println ("Digite o numero: ");
			num1 = scanner.nextInt();
		
					
			switch (conversao) {
			case 1: aux=ConversaoDeUnidadesDeTempo.minutoParaSegundos(num1);
			break;
			case 2: aux=ConversaoDeUnidadesDeTempo.horaParaMinutos(num1);
			break;
			case 3: aux=ConversaoDeUnidadesDeTempo.diaParaHora(num1);
			break;
			case 4: aux=ConversaoDeUnidadesDeTempo.semanaParaDias(num1);
			break;
			case 5: aux=ConversaoDeUnidadesDeTempo.anoParaDias(num1);
			break;
			default:
				System.out.println ("Operação inválida");

			}
			
			System.out.println (aux);
			
				
		scanner.close();
	
	}
}

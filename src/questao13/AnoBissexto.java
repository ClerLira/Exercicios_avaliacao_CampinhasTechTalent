package questao13;

import java.util.Scanner;

public class AnoBissexto {

	/*
	 * Programa a quantidade de dias no m�s.
	 */

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			int mes;
			
			do 	{			
			System.out.println("Digite um valor entre 1 e 12 para o m�s: ");		
			mes = scanner.nextInt();
							
			} while ((mes <=0) || (mes >12));
				
			
						
				switch(mes) {
				  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				     System.out.println("O m�s tem 31 dias");
					  break;
				  case 2:
					//descobrir se o ano � bissexto	
					  System.out.println("Digite o ano (xxxx): ");		
						int ano = scanner.nextInt();
						
						if (((ano % 400 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)){
							System.out.println("Esse m�s tem 29 dias");	
					    }else {
					    	System.out.println("Esse m�s tem 28 dias" );
					    }
					  break;
				  default:
					  System.out.println("O m�s tem 30 dias");
				}
			}

}

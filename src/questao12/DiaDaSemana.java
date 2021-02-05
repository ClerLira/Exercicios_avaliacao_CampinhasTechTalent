package questao12;

import java.util.Scanner;

public class DiaDaSemana {

	/*
	 * Escreva um programa que permita que o usu�rio digite 
	 * um n�mero entre 1 e 7 e ao final, diga para o usu�rio 
	 * qual o dia da semana que aquele n�mero representa: 
	 * 1 (Domingo), 2 (Segunda), ... 7 (S�bado).
	 */
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int dia;
		
		do 	{			
			System.out.println("Digite um valor entre 1 e 7 para o dia da semana: ");		
			dia = scanner.nextInt();							
			} while ((dia <1) || (dia >7));
		
		switch(dia) {
			case 1:
				System.out.println("� segunda-feira");
				  break;
			case 2:
				System.out.println("� ter�a-feira");
				  break;
			case 3:
				System.out.println("� quarta-feira");
				  break;
			case 4:
				System.out.println("� quinta-feira");
				  break;
			case 5:
				System.out.println("� sexta-feira");
				  break;
			case 6:
				System.out.println("� s�bado");
				  break;
			case 7:
				System.out.println("� domingo");
				  break;
			
		}
	}
}

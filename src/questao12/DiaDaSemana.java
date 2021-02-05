package questao12;

import java.util.Scanner;

public class DiaDaSemana {

	/*
	 * Escreva um programa que permita que o usuário digite 
	 * um número entre 1 e 7 e ao final, diga para o usuário 
	 * qual o dia da semana que aquele número representa: 
	 * 1 (Domingo), 2 (Segunda), ... 7 (Sábado).
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
				System.out.println("É segunda-feira");
				  break;
			case 2:
				System.out.println("É terça-feira");
				  break;
			case 3:
				System.out.println("É quarta-feira");
				  break;
			case 4:
				System.out.println("É quinta-feira");
				  break;
			case 5:
				System.out.println("É sexta-feira");
				  break;
			case 6:
				System.out.println("É sábado");
				  break;
			case 7:
				System.out.println("É domingo");
				  break;
			
		}
	}
}

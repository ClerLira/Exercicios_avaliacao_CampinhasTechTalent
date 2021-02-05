package questao08;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Eu sei dividir!");
		
		System.out.println("Informe o primeiro valor: ");
		double x = teclado.nextDouble();
		
		System.out.println("Informe o segundo valor: ");
		double y = teclado.nextDouble();
		
//		double r = (x/y);
//		System.out.println("O resultado da soma é " + r);
		
		try {
			double r =(x/y);
			System.out.println("O resultado da divisao é " + r);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divisao por zero. Informe outro valor diferente de 0: ");
			double z = teclado.nextDouble();
			double r =(x/z);
			System.out.println("O resultado da divisao é " + r);
		}
		
			
		teclado.close();
		}
	
}

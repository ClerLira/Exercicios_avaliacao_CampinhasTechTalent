package questao10;

import java.util.Scanner;

public class TesteCalculadora extends Calculadora{

	public static void main(String[] args) {
		int num1;
		int num2;
		int operacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println 
		("Digite a opera��o: "
				+ "\n1-adi��o, \n2-subtra��o, "
				+ "\n3-multiplica��o, \n4-divis�o, "
				+ "\n5-pontencia��o");
		operacao = scanner.nextInt();		
		
		System.out.println ("Digite o primeiro numero: ");
		num1 = scanner.nextInt();
	
		System.out.println ("Digite o segundo numero: ");
		num2 = scanner.nextInt();
		
		switch (operacao) {
		case 1: somar(num1, num2);
		break;
		case 2: subtrair(num1, num2);
		break;
		case 3: multiplicar(num1, num2);
		break;
		case 4: dividir(num1, num2);
		break;
		case 5: elevarPotenciaN(num1, num2);
		break;
		default:
			System.out.println ("Opera��o inv�lida");
		}
			
	scanner.close();
	}
}

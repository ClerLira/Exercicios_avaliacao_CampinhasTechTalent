package questao14;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero;
		boolean ehprimo = true;
				
				
		do 	{			
			System.out.println("Digite um n�mero maior que zero: ");		
			numero = scanner.nextInt();
		} while (numero <=0);
		
		
            for (int i = 2; i < numero; i++) {
    			if(numero % i == 0) {
    				//System.out.println("O n�mero " + numero + " n�o � primo");
    				ehprimo = false;
    			//	break;
    				}
            }
            
			if (ehprimo) {
    			System.out.println("O n�mero " + numero + " � primo"); 
			}     
			else 
				System.out.println("O n�mero " + numero + " n�o � primo");

		scanner.close();		
		
	}
}

package questao11;

import java.util.Scanner;

public class InverterOrdem {

//	Escreva um algoritmo que inverta o conteúdo de 
//	uma String utilizando uma estrutura de repetição. 
//	O usuário irá entrar com o valor de uma string, por exemplo
//	"ASDFG", e o programa deverá devolver o seguinte resultado 
//	"GFDSA". 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a string que deseja inverter: ");
				String string = scanner.nextLine();
		
				String fraseInvertida = "";
		
		for (int i = string.length()-1; i >= 0; i--) { 
			fraseInvertida += string.charAt(i); } 
		System.out.println(fraseInvertida);
		
		scanner.close();
		
	}	
}

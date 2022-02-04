package exercicio01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int chosenNumber;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número de 4 digitos entre 1000 e 9999: ");
		chosenNumber = scan.nextInt();
		
		String chosenNumberString = chosenNumber + "";
		
		
		
		if (chosenNumberString.length() != 4) {
			System.out.print("O Número digitado não contem 4 digitos !");
		} else if(chosenNumber < 1000) {
			System.out.print("O Número digitado não esta entre 1000 e 9999 !");
		}
		
			
		
		
	}
}

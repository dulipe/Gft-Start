package exercicio01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int chosenNumber;
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um n?mero de 4 digitos entre 1000 e 9999: ");
		chosenNumber = scan.nextInt();
		
		String chosenNumberString = chosenNumber + "";
		
		
		
		if (chosenNumberString.length() != 4) {
			System.out.print("O N?mero digitado n?o contem 4 digitos !");
		} else if(chosenNumber < 1000) {
			System.out.print("O N?mero digitado n?o esta entre 1000 e 9999 !");
		}
		
			
		
		
	}
}

/*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. */

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a letter: ");
		String string = in.nextLine();
		
		char letter = string.charAt(0);
		
		if (string.equals(in))
			System.out.println("Invalid imput.");
		
		if (letter == 'A' ||
			letter == 'a' ||
			letter == 'E' ||
			letter == 'e' ||
			letter == 'I' ||
			letter == 'i' ||
			letter == 'O' ||
			letter == 'o' ||
			letter == 'U' ||
			letter == 'u')
				System.out.println(letter +" is a vowel.");
		else 
			System.out.println(letter + " is a consonant.");
		
	}
}

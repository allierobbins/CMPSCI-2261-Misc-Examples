/* Take three numbers from the user and print the greatest number. */
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers.\n Number 1: ");
		int num1 = in.nextInt();
		System.out.println("Number 2: ");
		int num2 = in.nextInt();
		System.out.println("Number 3: ");
		int num3 = in.nextInt();
		
		int max = 0;
		
		if (num1 > num2 && num1 > num3)
			max = num1;
		else if (num2 > num1 && num2 > num3)
			max = num2;
		else 
			max = num3; 
		
		System.out.println("The greatest number is " + max);
	}

}

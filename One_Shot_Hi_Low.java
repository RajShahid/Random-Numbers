package Random_No;

import java.util.Random;
import java.util.Scanner;

public class One_Shot_Hi_Low {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		System.out.println("I'm thinking of a number between 1 to 100. Try to guess it.");
		System.out.print("Your guess: ");
		int guess = input.nextInt();
		System.out.println("");
		if(guess == x)
		{	
			System.out.print("You guessed it "+x+"!");	
		}
		else if(guess > x) {
			
			System.out.print("Sorry, you are too high.  I was thinking of  "+ x +".");
		}
		else if(guess < x)
		{
			System.out.print("Sorry, you are too low.  I was thinking of  "+ x +".");
		}
		else 
		{
			System.out.print("Sorry, but I was really thinking of "+ x +".");
		}
	}

}

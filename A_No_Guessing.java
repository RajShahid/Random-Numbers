package Random_No;
import java.util.Random;
import java.util.Scanner;

public class A_No_Guessing {

	public static void main(String[] args) {
	
		Random r = new Random();

		System.out.println( "I'm thinking of a number from 1 to 10." );
		int x = 1 + r.nextInt(10);
		Scanner in = new Scanner(System.in);
		System.out.println("Your guess: ");
		int y = in.nextInt();
		if(y == x)
		{
			System.out.println("That's right!  My secret number was  " + y);
		}
		else
		{
			System.out.println("Sorry, but I was really thinking of " + x);
		}
		
	}
}

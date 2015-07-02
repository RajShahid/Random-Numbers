package Random_No;

import java.util.Random;

public class Three_Cards_Monte {

	public static void main(String[] args) {
		Random r = new Random();
		int x = 1 + r.nextInt(3);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.");
		System.out.println("\nWhich one is the ace?");

		System.out.println("\n                      ## ## ##");
		System.out.println("                      ## ## ##");
		System.out.println("                      1  2  3");
		System.out.println( 1 + r.nextInt(3)); 
		System.out.println("");
		if(x==1) 
		{
			System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
			System.out.println("\n                      ## AA ##");
			System.out.println("                      ## AA ##");
			System.out.println("                      1  2  3");
		}
		
	   else if(x==2) {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			System.out.println("\n                      ## AA ##");
			System.out.println("                      ## AA ##");
			System.out.println("                      1  2  3");
		}
		
	   else if(x==3) {
			System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
			System.out.println("\n                      ## AA ##");
			System.out.println("                      ## AA ##");
			System.out.println("                      1  2  3");
		}
		
	}
}

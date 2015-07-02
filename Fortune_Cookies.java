package Random_No;

import java.util.Random;

public class Fortune_Cookies {

	public static void main(String[] args) {
		
		Random r = new Random();
		int b = 1 + r.nextInt(6);
		int lotto_no = 1 + r.nextInt(54);
		
		if(b==1) {
			
			System.out.println("Fortune Cookie Says : You will find happiness with a new love.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
		if(b==2) {
			
			System.out.println("Fortune Cookie Says : You will not be able to do any work.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
		if(b==3) {
			
			System.out.println("Fortune Cookie Says : This week you will spend too much money.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
		if(b==4) {
			
			System.out.println("Fortune Cookie Says : The upcoming week is lucky for you.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
		if(b==5) {
			
			System.out.println("Fortune Cookie Says : Everything will be good in life.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
		if(b==6) {
			
			System.out.println("Fortune Cookie Says : Stay calm.");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54)+" - ");
			System.out.print( 1 + r.nextInt(54));
		}
	}

}

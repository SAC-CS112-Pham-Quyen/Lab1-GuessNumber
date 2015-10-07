import java.util.Scanner;

public class Guess_A_Number {

	public static void main(String[] args) {
			
				@SuppressWarnings("resource")
				Scanner input = new Scanner( System.in );
				
				int computerNum;
				int guessNum;
				computerNum = 0 + (int) ( Math.random() *10 );
				
				
				System.out.print( "computerNum");
				computerNum = input.nextInt();
				
				System.out.print( "Guess a number: " );
				guessNum = input.nextInt();
				
				if ( computerNum == guessNum )
					System.out.printf( "%d == %d You guess correctly\n", computerNum, guessNum );
				
				
				if ( computerNum < guessNum )
					System.out.printf( "%d < %d Too Small Try again\n", computerNum, guessNum );
				
				
				if ( computerNum > guessNum )
					System.out.printf( "%d > %d Too Big Try again\n", computerNum, guessNum );
		
				
				
	}

}

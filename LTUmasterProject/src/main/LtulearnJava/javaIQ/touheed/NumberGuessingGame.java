package javaIQ.touheed;
import java.util.Random;
import java.util.Scanner;


/* Function Name : Number guessing game
 * Description   : Using of Random Class to generated random input 
 * Parameters    : Keyboard input in integer  value
 * Author & Date : Touheed Aslam & 21-Sep-2022
 * Modified Date :
 */

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();

        int range=10;
        int randomNumber = random.nextInt(range);

       // System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter the guessing number between 0 to "+ range );
        int guessNumber = scanner.nextInt();


        while (guessNumber != randomNumber) {

            if (guessNumber < randomNumber) {

                System.err.print("Low : Try again");
                System.out.println("");


            } else if (guessNumber > randomNumber) {

            	 System.err.print("High : Try again");
                 System.out.println("");

            } else break;
            guessNumber = scanner.nextInt();


        }

        System.out.println("Congrats You have guessed it right ");
        scanner.close();
    }

}
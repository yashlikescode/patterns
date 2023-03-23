import java.util.Scanner;
import java.lang.*;

public class Q39 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int abc;
        //the loop used is to check if the character entered by the user is a letter or not.
        do {
            System.out.println("Enter a letter of the alphabet:");
            abc = sc.next().charAt(0);
            System.out.println("Numbers not allowed. Please try again.");
        } while (!Character.isLetter(abc));

        //outer loop is for the number of rows while the inner, is for output the next letters of alphabet,  per row.
        for (int i = 0; i <= 8; i++){

            for (int j = 0; j <= i; j++) {
                System.out.print( (char) (abc + j)+ " ");
            }

            System.out.println();
        }
    }
}
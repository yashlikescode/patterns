import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the given number can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 0)
                break;
            else
                System.out.println("Invalid number. Please try again.");
        }

        // outer loop is for the number of rows while the inner is for the number of * per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print(i+" ");
            System.out.println();
        }
        
    }
}

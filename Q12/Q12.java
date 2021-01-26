import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the number given can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 0)
                break;
            System.out.println("Invalid number. Please try again.");
        }

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of numbers (increasing from 1 to numberOfRows)
        // and for adding a space after each number
        for (int i = numberOfRows; i > 0; i--) {
            int count = 0;
            for (int j = 1; j <= numberOfRows - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print(1 + count);
                System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }
}

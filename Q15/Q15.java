import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the number given can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 1)
                break;
            System.out.println("Invalid number. Please try again.");
        }

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = 1; j <= numberOfRows - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2; k++)
                System.out.print("*");
            System.out.println();
        }

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");
            for (int k = 1; k <= numberOfRows * 2 - (i - 1) * 2; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Q8 {

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
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= numberOfRows - i + 1; k++)
                System.out.print("*");
            System.out.println();
        }

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows - 1; i > 0; i--) {
            for (int j = 1; j <= numberOfRows - i; j++)
                System.out.print(" ");
            for (int k = i; k > 0; k--)
                System.out.print("*");
            System.out.println();
        }

    }
}

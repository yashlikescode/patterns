import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;
        int count;

        // the loop is used to check if the number given can make a pattern (must be an odd number greater than 1)
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if ((numberOfRows % 2 != 0) && (numberOfRows > 1))
                break;
            System.out.println("Invalid number. Please try again.");
        }

        count = 1;

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows / 2 + 1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            for (int k = 1; k <= count; k++)
                System.out.print("*");
            System.out.println();
            count += 2;
        }

        count = numberOfRows - 2;

        // outer loop is for the number of rows
        // the 1st inner loop is for the number of initial spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows / 2; i > 0; i--) {
            for (int j = 1; j <= numberOfRows - i - numberOfRows / 2; j++)
                System.out.print(" ");
            for (int k = 1; k <= count; k++)
                System.out.print("*");
            System.out.println();
            count -= 2;
        }
    }
}

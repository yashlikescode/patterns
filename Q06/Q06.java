import java.util.Scanner;

public class Q6 {

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
        // the 1st and 3rd inner loop are for the number of spaces per row
        // the 2nd inner loop is for the number of asterisks per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            for (int k = (numberOfRows - i + 1) * 2 - 1; k > 0; k--)
                System.out.print("*");
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the number given can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 2)
                break;
            System.out.println("Invalid number. Please try again.");
        }

        // the loop is for the number of * in the first row
        for (int i = numberOfRows; i > 0; i--)
            System.out.print("*");

        System.out.println();

        // outer loop is for the number of rows between the first and last rows
        // the inner loop is for the number of spaces in between the two * (per row)
        for (int i = numberOfRows - 2; i > 0; i--) {
            System.out.print("*");
            for (int j = numberOfRows - 2; j > 0; j--)
                System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }

        // the loop is for the number of * in the last row
        for (int i = numberOfRows; i > 0; i--)
            System.out.print("*");
    }
}

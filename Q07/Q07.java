import java.util.Scanner;

public class Q7 {

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

        // outer loop is for the number of rows while the inner is for the number of * per row
        for (int i = numberOfRows; i > 0; i--) {
            for (int j = numberOfRows - i + 1; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

        // outer loop is for the number of rows while the inner is for the number of * per row
        for (int i = numberOfRows - 1; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the number given can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 0)
                break;
            else
                System.out.println("Invalid number. Please try again.");
        }

        // outer loop is for the number of rows while the inner is for the number of * per row
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

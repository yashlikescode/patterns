import java.util.Scanner;

public class Q14 {

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

        /* used if statements and three loops instead of implementing just four loops
           - first loop is for the number of rows
           - second loop is for printing asterisks (*) per row
           - third loop is for printing spaces per row
           the same implementation goes for the bottom half
        */
        for (int i = numberOfRows; i > 0; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (count == 2)
                    break;
                System.out.print("*");
                if (j == i) {
                    for (int k = 1; k <= numberOfRows * 2 - (i * 2 - 1); k++)
                        System.out.print(" ");
                    j = 0;
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= numberOfRows; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (count == 2)
                    break;
                System.out.print("*");
                if (j == i) {
                    for (int k = 1; k <= numberOfRows * 2 - (i * 2) + 1; k++)
                        System.out.print(" ");
                    j = 0;
                    count++;
                }
            }
            System.out.println();
        }
    }
}

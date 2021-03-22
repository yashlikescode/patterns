import java.util.Scanner;

public class Q20{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the number given can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 1){
                break;
			}
            System.out.println("Invalid number. Please try again.");
        }
		
		// loop to iterate over rows
		for(int i = 0; i < numberOfRows; i++){
			// loop to print out spaces
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			// loop to print out asteriks 
			for(int j = 0; j < (2*i) + 1; j++){
				System.out.print("*");
			}
			// start a new line
			System.out.print("\n");
		}
	}
}
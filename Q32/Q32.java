import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		// random symbols for pattern
		String[] symbols = {"$", "*", "@", "#", "%"};
		
		while (true) {
			System.out.println("Enter any number: ");
			num = input.nextInt();
			if (num > 0)
				break;
			System.out.println("Invalid input, try again:");
		}


        // outer loop is for the number of rows
        // the 1st and 3rd inner loop are for the number of spaces per row
        // the 2nd inner loop is for the number or random symbols
        for (int i = num; i > 0; i--) {
        	int random = (int) (Math.random()*symbols.length);
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            for (int k = (num - i + 1) * 2 - 1; k > 0; k--)
                System.out.print(symbols[random]);
            for (int j = i - 1; j > 0; j--)
                System.out.print(" ");
            System.out.println();
        }
		
		


}

}

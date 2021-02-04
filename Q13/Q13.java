import java.util.Scanner;

public class Q13 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    int numberOfRows;

    // loop used to verify correct number of rows to make a pattern
    while (true) {
      System.out.println("Enter a number: ");
      numberOfRows = scanner.nextInt();
      if (numberOfRows > 0) {
        break;
      }
      System.out.println("Invalid number. Number must be a positive integer");
    }
    // execute method that creates pattern
    createQ13Pattern(numberOfRows);

  }

  /*
    This method creates the Q13 pattern.
    @param numberOfRows type of integer to specify number of rows in the pattern
    Method prints to the console specified Q13 pattern @see README.md
   */
  static void createQ13Pattern(int numberOfRows) {

    // outer loop is for number of rows
    // inner loop is for filling row with empty spaces - first condition,
    // else condition fills row with numbers
    for (int i = 0; i < numberOfRows; i++) {
      for (int j = 0; j <= numberOfRows; j++) {
        if (j < numberOfRows - i) {
          System.out.print("  ");
        } else {
          System.out.print(fillPatternWithNumbers(i));
          break;
        }
      }
      System.out.println();
    }
  }

  /*
    Method that creates a String with numbers and empty spaces for selected row
    @param row Sets how to fill the specified row
   */
  static String fillPatternWithNumbers(int row) {
    int numberToBeFilled = 1;
    StringBuilder builder = new StringBuilder();
    for (int i = numberToBeFilled; i < row + 1; i++) {
      builder.append(numberToBeFilled++).append(" ");
    }
    for (int i = numberToBeFilled; i > 0; i--) {
      builder.append(numberToBeFilled--).append(" ");
    }

    return builder.toString();
  }
}

public class Q22 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numberOfRows;

        // the loop is used to check if the given number can make a pattern
        while (true) {
            System.out.print("Enter a number: ");
            numberOfRows = scanner.nextInt();
            if (numberOfRows > 0)
                break;
            else
                System.out.println("Invalid number. Please try again.");
        }
        printPattern(numberOfRows);
    }
    
    public static void printPattern(int nPattern){
        int startIdx = 0;
        int endIdx = nPattern;
      //Loop to print n differnet rows 
        while(startIdx < nPattern){
            //Loop to print n different cols
            for(int i = startIdx; i < endIdx; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            startIdx++;
            endIdx++;
        }
    }
}

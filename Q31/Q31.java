import java.util.Scanner;

public class Q31_Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n value to generate pattern : ");
        int n = scan.nextInt();
        pattern(n);
    }

    private static void pattern(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}

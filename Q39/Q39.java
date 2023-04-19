import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q39 {

    public static void main(String[] args)   {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  i, j, space;

        System.out.println("Enter the number of rows: ");
        int n = leerInt(br);

        space = n - 1;

        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("@");
            }
            System.out.println();
        }

        space = 1;
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    // created method for check that the user input only numbers and avoid forced exit system.
    public static int leerInt (BufferedReader buff){
        int lee = 0;
        boolean error;
        do {
            error = false;
            try {
                lee = Integer.parseInt(buff.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Input incorrect, repeat:?");
                error = true;
            } catch (Exception ex) {
                ex.printStackTrace(System.err);
            }
        } while (error);
        return lee;}
}
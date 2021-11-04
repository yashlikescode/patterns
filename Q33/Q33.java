import java.util.Scanner;

public class Q33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int len = s.nextInt();
        int k=1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i%2==0){
                    System.out.print(i*len+j+1+" ");

                }else{
                    System.out.print((i+1)*len-j+" ");
                }
            }
            System.out.println();
        }

    }
}

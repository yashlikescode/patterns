import java.util.*;

public class Q18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        int n = sc.nextInt();
        int i=1,j=n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i%2==j%2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

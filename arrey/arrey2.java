package arrey;
import java.util.Scanner;

public class arrey2 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int [][] a = new int[2][5];
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<5;j++)
            {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<5;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package arrey;
import java.util.Scanner;

public class arrey3 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int [][][] a = new int[2][3][5];
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                for (int k=0;k<5;k++)
                {
                    System.out.println("Enter the age of school " + i + " class " + j + " student " + k );
                    a[i][j][k] = scan.nextInt();
                }
            }
        }
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                for (int k=0;k<5;k++)
                {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

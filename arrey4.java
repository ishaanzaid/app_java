import java.util.Scanner;

public class arrey4 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int [][] a = new int[2][5];
        System.out.println("the print of a.lenght " + a.length);
        System.out.println("the print of a[0].lenght " + a[0].length);
        System.out.println("the print of a[1].lenght " + a[1].length);

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

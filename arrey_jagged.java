import java.util.Scanner;

public class arrey_jagged {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);


        int [][][] a = new int[2][][];
        a[0] = new int [3][];
        a[1] = new int [2][];
        a[0][0] = new int[6];
        a[0][1] = new int[5];
        a[0][2] = new int[5];
        a[1][0] = new int[2];
        a[1][1] = new int[3];

        int i,j,k;



        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                for (k=0;k<a[i][j].length;k++)
                {
                    System.out.println("Enter the age of school " + i + " class " + j + " student " + k );
                    a[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("The ages are");
        for (i=0;i<a.length;i++)
        {
            for (j=0;j<a[i].length;j++)
            {
                for (k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

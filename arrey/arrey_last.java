package arrey;

public class arrey_last {

    public static void main(String[] args) 
    {
        int i,j,k;
        int[][][] a = {
            {{10,20,30,40},{10,20,30},{10,20}},
            {{10,20,30,40},{10,20,30,40}}
        };
       //this can be used only if we know the data

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

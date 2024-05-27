class day6 {
    public static void main(String[] args) {
        int i;
        int j;
        int n=10;
        int count=1;
        for (j=1;j<=n;j++)
            {
                for(i=1;i<=n;i++)
                    {
                        if(i==1 || i==n || j==1 || j==n )
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
            }
    }
}
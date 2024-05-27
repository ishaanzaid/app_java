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
                        if(count<10)
                        {
                            System.out.print("0" + count + " ");
                            count++;
                        }
                        else
                        {
                            System.out.print(count + " ");
                            count++;
                        }
                    }
                    System.out.println(" ");
            }
        
    }
}
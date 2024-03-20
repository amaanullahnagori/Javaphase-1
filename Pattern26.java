class Pattern26
{
    public static void main(String args[])
    {
        for(int i=1;i<=3;i++)
        {
            for(int s=1;s<=3-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                j=j+2;
              //  System.out.println(j);
            }
            System.out.println("");
        }
    }
}
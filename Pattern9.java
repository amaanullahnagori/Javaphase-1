class Pattern9
{
    public static void main(String args[])
    { char f='*';
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%1c ",f);
                
            }System.out.println(" ");
        }
    }
}
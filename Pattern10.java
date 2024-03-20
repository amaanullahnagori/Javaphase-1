class Pattern10
{
    public static void main(String args[])
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                int p=i+j;
               if(p==2) 
                {
                    System.out.print(" ");
                
               }
               else if(p==3)
                        {
                            System.out.print(" ");
                        }
               else if(p==4)
                        {
                            System.out.print(" ");
                        }
               else if(p==5)
                        {
                            System.out.print(" ");
                        }
               else 
                System.out.print("*");
            }System.out.println(" ");
        }
    }
}
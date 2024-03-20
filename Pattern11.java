class pattern11
{
    public static void main(String args[])
    { int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
            if (j<=4&&i==1)
                {
            System.out.print(" ");
                }
           else if (j<=3&&i==2)
                {
            System.out.print(" ");
                }
          else  if (j<=2&&i==1)
                {
            System.out.print(" ");
                }else if (j<=4)
                {
            System.out.print(" ");
                }
          else if(i==4&&j==1)
          {
              System.out.println(" ");
          }
          
          else 
          {
                System.out.print("*");
            }
            
            }System.out.println(" ");
        }
        
    }
}
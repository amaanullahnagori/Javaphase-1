import java.util.*;
class Pattern47// plus 
{
    public static void main(String args[])
    {  Scanner  sc= new Scanner(System.in);
        System.out.println(" << ENTER A NUMBER >>");
    int n=sc.nextInt();
      if(n%2!=0)
        {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==(n+1)/2)
                {
                    System.out.print("* ");
                }
                else if(j==(n+1)/2)
                {
                    System.out.print("* ");
                }else 
                {
                    System.out.print("  ");
                }
            }System.out.println("");
        }
        }
        else if(n%2==0)
        {
             
        
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==(n)/2)
                {
                    System.out.print("* ");
                }
                else if(j==(n)/2)
                {
                    System.out.print("* ");
                }else 
                {
                    System.out.print("  ");
                }
            }System.out.println("");
        }
        
    }
        else 
        {
            System.out.println("ENTER A CORRECT NUMBER ");
        }
}
}


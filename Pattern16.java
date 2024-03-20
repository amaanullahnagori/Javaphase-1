import java.util.*;

class Pattern16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
        System.out.println("");
    }
     for(int k=1;k<=n;k++)
{
    int y=k-1;
    //System.out.println(y);
    for(int sp=1;sp<=y;sp++)
    {
        System.out.print(" ");
    }
    
                {
        for (int j=n;j>=k;j--)
        {
            
            System.out.print("* ");
        }
      } 
                System.out.println(" ");
}
    }   
}
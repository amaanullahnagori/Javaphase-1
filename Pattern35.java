import java.util.*;
class Pattern35
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int  j=1;j<=i;j++)
            {
                System.out.print("*");
            }System.out.println("");
        }
        for (int s=1;s<=n;s++)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=s;j++)
            {
                System.out.print("*");
            }System.out.println("");
        }
    }
           
}
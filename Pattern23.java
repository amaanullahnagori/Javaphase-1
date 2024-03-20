import java.util.*;
class Pattern23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(">>>Enter a number<<");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                
            }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print("*");
            } System.out.println("");
        }
}
   }

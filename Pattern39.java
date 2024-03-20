import java.util.*;
class Pattern39
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(int h=2;h<=i;h++)
            {
                System.out.print(h+" ");
            }System.out.println("");
        }
    }
}
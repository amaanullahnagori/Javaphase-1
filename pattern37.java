import java.util.*;
class Pattern37
{
    public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for (int l=1;l<=n-1;l++)
            {
                System.out.print("* ");
            }System.out.println("");
        }
    }
}
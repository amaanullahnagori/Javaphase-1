import java.util.*;
class pattern25
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("<<ENTER THE NUMBER FOR HOUR GLASS>>");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=i-1;s++)
            {
                System.out.print(" ");
            }
            for (int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }System.out.println(" ");
        }
        for (int l =1;l<=n;l++)
        {
            for (int s=1;s<=n-l;s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=l;k++)
            {
                System.out.print("* ");
            }System.out.println("");
        }
    }
}
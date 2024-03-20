import java.util.*;
class Pattern27
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("<<----------ENTER THE NUMBER--------->>");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
                
            }
            for(int s=1;s<=n*2-i*2;s++)
            {
                System.out.print(" ");
                
            }
            for (int z=1;z<=i;z++)
            {
                System.out.print("*");
            }System.out.println("");
        }
    }
}
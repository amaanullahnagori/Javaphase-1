import java.util.*;
class Pattern20
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
            {
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--)
            {
                System.out.printf("%1d ",col);
            }
            for (int k=2;k<=row;k++)
            {
                System.out.printf("%1d ",k);
            }
            
            System.out.println("");
        }
    }
            
}
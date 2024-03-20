import java.util.*;
class Pattern32
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("<<ENTER A NUMBER TO SEE YOUR SQUARE>>");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i==1)
                {
                    System.out.print("*");
            }else if (i==n)
                    {
                    System.out.print("*");
                    }
            else if (j==1)
            {
                System.out.print("*");
            }
            else if(j==n)
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        } System.out.println(" ");
    }
    }
}

    
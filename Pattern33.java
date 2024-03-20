import java.util.*;
class Pattern33
{
    public static void main (String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("<<ENTER A NUMBER TO SEE NUMBER DIAMOND>>");
        int n=sc.nextInt();
      int count=n-1;
    
       int num=n-1;
        for (int i=1;i<=n;i++)
        {
        for(int s=1;s<=n-i;s++)
        {
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        for (int k=2;k<=i;k++)
        {
            System.out.print(i);
        }System.out.println("");
        }
        for (int i=1;i<=n-1;i++)
        {
            for (int s=1;s<=i;s++)
            {
                System.out.print(" ");
        }
           for (int j =n-1;j>=i;j--)
           {
               System.out.print(count);
           }
           count--;
           {
           for (int l=n-2;l>=i;l--)
           {
               System.out.print(num);
           }
           num--;
            System.out.println("");
    }
}
}
}


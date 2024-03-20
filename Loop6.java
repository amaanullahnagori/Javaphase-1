import java.util.*;
class Loop6
{  
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);
        System.out.println(" ENTER A NUMBER");
    int n=sc.nextInt();
      System.out.println("THE EVEN NUMBER BETWEEN 0 & " +n+" is :-");
    {
        for (int i=0;i<=n;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
}

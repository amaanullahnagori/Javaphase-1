import java.util.*;
class pattern23

{
    public static void main (String args[])
    {  Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of our choice");
        int n;
        n=sc.nextInt();
       // int q=n/2;
        //int f=q+1;
       // System.out.println(q);
        for (int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int s=1;s<=2*i-1;s++)
            {
                System.out.print(" ");
            } 
            for (int k=n;k>=i;k--)
            {
                System.out.print("*");
        }
            System.out.println("");
    }
    
      /*  for(int r=1;r<=n;r++)
        {
            for(int l=1;l<=r+1;l++)
            {
                System.out.print("*");
            }
            for(int s=n-2;s>=2*r-1;s--)
            {
                System.out.print(" ");
            }
            for (int y=1;y<=r+1;y++)
            {System.out.print("*");
        }System.out.println("");
    }*/
} }
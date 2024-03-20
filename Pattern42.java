import java.util.*;
class Pattern45 //diamond 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("    enter a number  ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) //this loop is for rows
        {
            for(int s=1;s<=n-i;s++) // for space
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++) // for star in upper part 
            {
                System.out.print("*");
            }System.out.println("");
            
        }
        for(int i=1;i<=n-1;i++) //  for row
        {
            for(int j=1;j<=i;j++) // for space 
            {
                System.out.print(" ");
            }
            for(int h=n-1;h>=i;h--) //for star in lower left part 
            {
                System.out.print("*");
            }
            for(int p=n-2;p>=i;p--) // for star in lower right part 
            {
                System.out.print("*");
            }System.out.println("");
        }
        
    }
}
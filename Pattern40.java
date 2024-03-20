import java.util.*;
class Pattern40
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
 System.out.println("YOUR NUMBER WILL BE EQUAL TO NUMBER OF STAR TO BE PRINTED");
        System.out.println("ENTER A NUMBER");

        int n=sc.nextInt();
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)%4==0)
                {
                    System.out.print("*");
                }
                else if(j%4==0&&i%2==0)
                {
                    System.out.print("*");
                    
                }
                else 
                {
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}

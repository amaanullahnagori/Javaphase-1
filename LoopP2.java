import java.util.*;
class LoopP2
        //sum of number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number ");
        int n=sc.nextInt();
        int i;
        int sum = 0;
        {
        for( i=0; i<=n;i++)
        {
            
            sum=sum+i;
        }
         System.out.println(sum);}
    }
} 
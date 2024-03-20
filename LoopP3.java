import java.util.*;
class LoopP3
        //factorial of number
{
    public static void main(String args[])
            
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number ");
        int n=sc.nextInt();
        int i;
        long fact= 1;
        {
        for( i=1; i<=n;i++)
        {
            
            fact=fact*i; 
        }
         System.out.println(fact);
        }
    }
} 
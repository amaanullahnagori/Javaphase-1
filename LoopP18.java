import java.util.*;
class LoopP18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int a=sc.nextInt();
        System.out.println("ENTER A POWER YOU WANT OF "+a);
        int n=sc.nextInt();
        int sum_power=1;
        for(int i=1;i<=n;i++)
        {
            sum_power=sum_power*a;
        }System.out.println(a+" to the power "+n+" is "+sum_power);
    }
}
import java.util.*;
class Loop7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER TWO NUMBER UPTO WHICH U WANT SUM");
        System.out.println("ONE IS TO START && OTHER IS TO END");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int s=0;
        if (n<r)
        {
for(int i=n;i<=r;i++)
        {
            if(i%2==0)
            {    s=s+i;
            
        }  }
        
System.out.println("THE SUM OF EVEN NUMBER FROM "+n+" UPTO "+r
        
        +" is "+s);
       
        }
        else 
        {
            System.out.println("INVALID");}
    }
}
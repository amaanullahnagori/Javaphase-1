import java.util.*;
class LoopP10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        
       //int n=sc.nextInt();
        //String c="A";
        int sum=0;
   while(true)
        {  
            System.out.println("Enter a number");
            int  c=sc.nextInt();
            sum=sum+c;
            if(sum>100)
            {
                                                                                 
                System.out.println("done sum is "+sum);
                break;
               
            }
               
        }
    }
}
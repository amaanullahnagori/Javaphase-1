import java.util.*;
class  LoopP19
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sumE=0;
        int sumO=0;
        System.out.print("HOW MANY  NUMBER YOU WANT TO ENTER :");
        int n=sc.nextInt();
        System.out.println("ENETR THE NUMBERS : ");
        for(int i=1;i<=n;i++)
        {
            int num=sc.nextInt();
            if(num%2==0)
            {
                sumE=sumE+num;
            }
            else if(num==0)
            {
            continue;
            }
            
            else 
            {
                sumO=sumO+num;
            }
        }
   System.out.println("THE SUM OF EVEN NUMBER IN OUR ENTERED LIST"
                + " OF NUMBER IS : "+sumE);
   System.out.println("THE SUM OF ODD NUMBER IN OUR ENTERED LIST"
                + " OF NUMBER IS : "+sumO);
        
    }
}
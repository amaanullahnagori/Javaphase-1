import java.util.*;
class LoopP2_1PORNP
{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS PRIME OR NOT :-");
                
        int num=sc.nextInt();
        int i;
              int  c=0;
        if(num>0)
        {
     for(i=2;i<num;i++)
     {
         if(num%i==0)
         {
             System.out.println("NOT A PRIME");
             break;
         }
         else
         { 
         c++;
     }
     }
     if(c==(num-2))
     {
         System.out.println("PRIME");
     }
        }
        else
        {
            System.out.print("PLEASE ACQUIRE THE KNOWLEDGE OF MATHEMATICS");
            System.out.println(" BECAUSE YOU DON'T NOW ");
            System.out.println("0 IS PRIME OR NOT.");
                    
                
        
              
        }System.out.println("THANK YO");
    }
}

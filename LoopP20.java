import java.util.*;
class LoopP20
{
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS PRIME OR NOT"
                + "");
        int num=sc.nextInt();
        int i;
        if(num>0)
        {
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
System.out.println("THE NUMBER YOU HAVE ENTERD IS NOT A PRIME");
                break;       
            } 
        }
        if(i==num)
            System.out.println("THE NUMBER YOU HAVE ENTERD IS PRIME NUMBER");
        }
        else 
        {
            System.out.println("INVALID");
        }
      
}
}

import java.util.*;
class LoopP11
{
    public static void main(String args[])
    {   
        int i=0;
        int Esum=0;
        int Osum=0;
        Scanner sc=new Scanner(System.in);
        while(i<4)
        {   
            System.out.println("ENTER A NUMBER");
            int c=sc.nextInt();
            
            if( c%2==0)
            {
                Esum=Esum+c;
                //System.out.println(Esum);
            } 
                       else if(c%2!=0)
            {
                Osum=Osum+c;
                
            }
            else if (c==0)
            {  
                
              continue;
            }
            else
            {
                System.out.println("INVALID");
        } i++;

           // System.out.println(Esum);
            //4System.out.println(Osum);
    
    }System.out.println("THE VALUE OF SUM OF ODD NUMBER IN THE LIST IS "+Osum);

        System.out.println("THE VALUE OF SUM OF EVEN NUMBER IN THE LIST IS "+Esum);
}
}

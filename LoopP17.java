import java.util.*;
class LoopP17
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER WHOSE WORD YOU WANT");
        int n=s.nextInt();
        int c=0;
        int r,p;
       // String str="";
          //String str1="";
        while(n>0)
        {
            r=n%10;
            n=n/10;
            c=c*10+r;
          
        }//System.out.println(str);
        
        for(;c>0;)
        {
            p=c%10;
            c=c/10;
        if(p==1)
                System.out.println("one");
        else if (p==2)
                System.out.println("two");
        else if (p==3)
                System.out.println("three");
            else if (p==4)
                System.out.println("four");
            else if (p==5)
                System.out.println("five");
            else if (p==6)
                System.out.println("six");
            else if (p==7)
                System.out.println("seven");
            else if (p==8)
                System.out.println("eight");
            else if (p==9)
                System.out.println("nine");
            else 
                System.out.println("zero");
        }
    }
}

            
            
        
         
            
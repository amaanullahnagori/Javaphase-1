import java.util.*;
import java.lang.*;
class Radix
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str;
        str=sc.nextLine();
         boolean a=str.matches("[0 1]*");
         System.out.println(a);
        boolean b=str.matches("[0 -7]*");
            System.out.println(b);
            boolean c= str.matches("[0-9");
            System.out.println(c);
       
if(a==true)
{
    System.out.println("redix is 2");
    
}
else if (b==true)
{  
    System.out.println("Radix is 8");
   
}
else if(c==true)
{
    System.out.println("the Redix is 10");
}
else
{    
    System.out.println("Redix is 16");
    }
    
    }
} 

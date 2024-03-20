import java.util.*;
class String11Application_RE_quantifier
 // we have to check whether the given email by user is correct or not
{
    public static void main (String args[])
            
    {
       Scanner sc=new Scanner(System.in);
       String str;
       System.out.println("enter email address");
       str=sc.nextLine();
        //String str = "Zen1232@gmail.com";
       boolean b=str.matches("\\w*@gmail.com");
       System.out.println("you entered email address is :\n"+b);
               
        
    }
    
}
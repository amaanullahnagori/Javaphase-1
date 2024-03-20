import java.lang.*;
import java.util.*;
class IfElseURL
{
    public static void main(String args[])
    {
       
        String url;
        Scanner sc=new Scanner  (System.in);
          System.out.println("Enter the url");
        url=sc.nextLine();
        int b=url.length();
    
      
      int c= url.indexOf(".");
      
       int a=url.indexOf(":");
       String str=url.substring(0,a);
      String str1=url.substring(++c,b);
      
       
      
        if (str.equals("http"))
        {
            if (str1.equals("gov"))
            {
            System.out.println(""+str+" is hyper text transfer protocol\nand the website u enter is government");
            }
            if (str1.equals("com"))
            {
                System.out.println(""+str+" is hyper text transfer protocol\nand the website u enter is commercial");
            }
        }
        
           else if (str.equals("ftp"))
        {
            if (str1.equals("gov"))
            {
            System.out.println(""+str+" is file transfer protocol\nand the website u enter is government");
            }
            if (str1.equals("com"))
            {
                System.out.println(""+str+" is file transfer protocol\nand the website u enter is commercial");
            }
        }
        else if(str.equals("https"))
        {
             if (str1.equals("gov"))
            {
            System.out.println(""+str+" is hyper text transfer protocol secured\nand the website u enter is government");
            }
            if (str1.equals("com"))
            {
                System.out.println(""+str+" is hyper text transfer protocol secured\nand the website u enter is commercial");
            }
        }
        else
        {
            System.out.println("the website you enter is invalid or is out of my reach.") ;
        }
        System.out.println("<3 THANK YOU <3");
    }
}
import java.util.*;
class StringPractice5
{
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
                str=sc.nextLine();
                String str1=str.replaceAll(" ", "");
                String str2=str1.trim();
//gfjkfgfj^&&^y
String str3=str2.replaceAll("[^a-z A-z]","");
//jvcdlvugAASDA
int n= str3.length();

   System.out.println( "THE NUMBER OF CHARACTER IN YOUR STRING IS :"+n);
                        
                         
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
    }
}
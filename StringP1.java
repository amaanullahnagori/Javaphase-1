import java.lang.*;
class StringP1
{
    public static void main(String args[])
    {
        String str="programmer@gmail.com";
        String str1=str.substring(0, 10);
        String str2=str.substring(10, 20);
        int a =str.length();
        System.out.println("the username is :"+str1);
        String str3="@gmail.com";
        boolean b=str3.equals(str2);
        System.out.println(b);
    }
}   
import java.util.*;
class String4
{
public static void main(String args[])
{
String str1="java";//its object is created in pool with a reference pounting toward java
String str2="HELLO";
str1=str1.toUpperCase();//reference point will be changed toward JAVA in pool
System.out.println("the upper case method ka jaado :"+str1);
str2=str2.toLowerCase();
System.out.println("the lower case method ka jaado :"+str2);
}
        
}
/* function uses kya he */ 
// oops me samj aayga :)


import java.util.*;
class Function1
{
  public static int sum(int a,int b)
    {
      int  s=a+b;
    //   System.out.println(s);
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
       int c=sc.nextInt();
      int d= sum(n,c);
       
               
      System.out.println(d);
    }
}
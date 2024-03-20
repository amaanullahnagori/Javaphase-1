import java.util.*;
class Switchp4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("!!MENU!!");
       System.out.println("Add");
       System.out.println("Substract");
       System.out.println("Divide");
       System.out.println("Enter the two number");
       int a=sc.nextInt();
       int b=sc.nextInt();
       sc.nextLine();
       System.out.println("Choose the option from the menu and write it");
       String str= sc.nextLine();
       switch(str)
       {
           case "Add":
               System.out.println(a+b);
               break;
           case "Substract":
               System.out.println(a-b);
               break;
           case "Divide":
               System.out.println(a/b);
               break;
           case "Multiply":
               System.out.println(a*b);
               break;
       }
    }
} 
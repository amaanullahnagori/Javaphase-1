import java.util.*;
class IfElse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter your age");
        age=sc.nextInt();
        
        if (age>=14  &&  age<=55)
           
        {
            System.out.println("you are young");
            
        }
        else {
            System.out.println("you are not young");
        }    
    }
}

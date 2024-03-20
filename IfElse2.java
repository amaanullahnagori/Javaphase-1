import java.util.*;
class IfElse2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the marks of three subject");
                int a,b,c;
                a=sc.nextInt();
                c=sc.nextInt();
                b=sc.nextInt();
                double avg= (a+b+c)/3;
                System.out.println("the average number is :"+avg);
                if (avg>70)
                    System.out.println("your grade is A");
                else if (avg>60 && avg<=70)
                {    System.out.println("your grade is B");
                }
                else if (avg>50 && avg<=60)
                {
                    System.out.println("your grade is C");
                }
                else 
                {
                    System.out.println("your grade is D");
                }
    }
}
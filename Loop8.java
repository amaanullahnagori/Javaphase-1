import java.util.*;
class Loop8
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int i;
    
    do
    {   
        System.out.println("ENTER MARKS");
         int marks=sc.nextInt();
         if(marks>=0&&marks<=100){
        if(marks<100&&marks>=70)
        {
            System.out.println("Excellant");
        }
        else if (marks<70&&marks>50)
        {
            System.out.println("Good");
        }
        else if (marks>=50&&marks<=20)
        {System.out.println("Poor");
    }
        else 
        {
            System.out.println("YOU ARE NOT A LOOSER");
        }
         }
         else
         {
             System.out.println("INVALID MARKS");
         }
        System.out.println("WANT TO CHECK MORE ? PRESS (1) OTHERWISE (0) TO EXIT");
        i=sc.nextInt();
    } while (i==1);
}
}


import java.util.*;
/*if a year is divisible by 4
if a year is divisible by 400
if a year  is not divisible by 100 
the above condition are used to find a leap year
*/
class Leap
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year of your choice\nSo that I can check whether it is leap or not.");
        int year =sc.nextInt();
        if (year%4==0)
        {
            System.out.println("year " +year+" is a leap year \nTHANK YOU");
        
        }else if (year%100==0)
        {
            System.out.println("year "+year+" is a leap year \nTHANK YOU");
        }
        else if (year%400==0)
        {
            System.out.println("year "+year+" is not a leap year \nTHANK YOU");
        }
        else 
        {
            System.out.println("year "+year+" is not a leap year\nTHANK YOU ");
        }
    } 
}
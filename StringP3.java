import java.util.*;
//dd.mm.yyyy
class StringP3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                String str;
                
                System.out.println("dd/mm/yyyy formet is allowed");
                System.out.println("enter the date");
                str=sc.nextLine();
     boolean b=str.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/[0-9]{4}");
                System.out.println(b);
                
                
    }
} 
import java.util.*;
class pattren14
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
        int i,j,m;
        int n;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*"); 
            }System.out.println("");
        }
    for(m=1;m<=(a-1);m++)
    {
        for(n=(a-1);n>=m;n--)
        {
            System.out.print("*");
        }System.out.println("");
    }
    }
         
        }


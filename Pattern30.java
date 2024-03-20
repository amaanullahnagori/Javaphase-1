import java.util.*;
class Pattern30
{
    public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
        char b='a';
        for(int i=1;i<=5;i++)
        { 
            for(int j=1;j<=i;j++)
            { 
                System.out.print(b+" ");
                b++;
            }
            System.out.println("");
        }
                for(int n=1;n<=4;n++)
                {
                    for(int y=4;y>=n;y--)
                    { 
                        System.out.print(b+" ");
                        b++;
                }System.out.println("");
            }                
                    
        }
    }


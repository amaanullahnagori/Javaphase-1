import java.util.*;
class  Pattern17
{
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to see your butterfly");
    int v=sc.nextInt();
    System.out.println("YOUR BUTTERFLY>>");
      
    for(int j=0;j<=v;j++)
    {
      int i;
      for (i=1;i<=j;i++)
      {
          System.out.print("*");
      }
     for(int s=1;s<=(v*2)-(2*j);s++)
      {
          System.out.print(" ");
      }
      for (int p=1;p<=j;p++)
      {
         System.out.print("*");
      }System.out.println("");
    
    }
    for (int k=1;k<=v-1;k++)
    {
        for (int z=v-1;z>=k;z--)
        {
            System.out.print("*");
        }
        for(int l=1;l<=2*k;l++)
        {
            System.out.print(" ");
        }
        for (int x=v-1;x>=k;x--)
        {
            System.out.print("*");
        }
        System.out.println(" ");
} 
}
}



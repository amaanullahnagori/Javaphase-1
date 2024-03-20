import java.util.*;
class ArrayP7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array you want");
        int n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println(" now enter the element of an array ");
        for(int j=0;j<a.length-1;j++)
        {
            a[j]=sc.nextInt();
        } 
        System.out.print("{");
        for(int j=0;j<a.length;j++)
          {
              System.out.print(a[j]+",");
          }
        System.out.println("}");
        System.out.print("ENTER THE INDEX ");
        int y=sc.nextInt();
        System.out.println("ENTER A NUMBER YOU WANT AT THAT INDEX");
        int b=sc.nextInt();
        for(int i=a.length-2;i>=y;i--)
                  {
                      a[i+1]=a[i];
                  }

                  a[y]=b;
                      System.out.print("{");
                  for(int i=0;i<a.length;i++)
                  { 
                  
                      System.out.print(a[i]+",");
            
                      
                  }          
                  System.out.println("}");
    
    
    
    }
}



                
                  
                  
                  
           
                 
    

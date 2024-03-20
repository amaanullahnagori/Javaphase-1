import java.util.*;
class ArrayP2 //searching in array 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]={4,5,6,1,8,7,3};
        int i;
        for( i=0;i<arr.length;i++)
        {
           if(arr[i]==n)
           {
               System.out.println("THE ELEMNT IS PRESENT AT INDEX "+i);
               break;
           }
        }if(i==arr.length)
        {
            System.out.println("THE ELEMENT YOU ENTERED IS NOT PRESENT IN THE ARRAY ");
        }
    }
}
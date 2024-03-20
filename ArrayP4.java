//SECOND LARGEST NUMBER IN AN ARRAY 
class ArrayP4
{
    public static void main(String[] args) 
    {
        int a[]={12,3,7,14,1};
        int max=a[0];
        int i;
        for( i=0;i<a.length;i++)
        {
           if(a[i]>max)
           {
               max=a[i];
           }
        }
       for( i=0;i<a.length;i++)
       {  
           if(max==a[i])
           {
            a[i]=Integer.MIN_VALUE;
           break;
       } }
       int max2=a[0];
     for( i=0;i<a.length;i++)
     {
         if(a[i]>max2)
         {
             max2=a[i];
         }
     }
     System.out.println("THE SECOND MAXIMUM NUMBER OF ARRAY IS "+max2);
} 
}


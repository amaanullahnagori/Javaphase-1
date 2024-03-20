class ArrayP1//sum of element in the array 
{
    public static void main(String[] args) {
        int sum=0;
   int a[]={3,9,7,8,12,6,15};
   int b[]=new int[5];
 

   for (int i=0;i<a.length;i++)
   {
    sum=sum+a[i];
   }System.out.println("THE SUM OF ELEMENT IN THE ARRAY IS "+sum);

    }
}
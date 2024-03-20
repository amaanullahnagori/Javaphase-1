class ArrayP16 //MULTIPLICATION OF MATRIX
{
    public static void main (String args[])
    { 
        int sum=0;
        int a [][]=new int[3][3];
           int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
           int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
           if(ar[0].length==arr.length){
           for(int i =0;i<ar.length;i++)
           {
               for (  int j=0;j<ar[0].length;j++)
               {
                   for(int z=0;z<a[0].length;z++)
                   {
                       sum=sum+ar[i][z]*arr[z][j];
                     a[i][j]=sum;
               }a[i][j]=sum;
                  sum=0;
               }
           }
    System.out.println("THE MULTIPLICATION OF TWO MATRIX");
        System.out.println("FIRST MATRIX");
    for(int i=0;i<ar.length;i++)
{
    for(int j=0;j<ar[0].length;j++)
    {
        System.out.printf("%2d  ",ar[i][j]);
    } System.out.println("");
}
        System.out.println("SECOND MATRIX");
    for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[0].length;j++)
    {
        System.out.printf("%2d  ",arr[i][j]);
    } System.out.println("");
}
        System.out.println("MULTIPLIED MATRIX");
for(int i=0;i<a.length;i++)
{
    for(int j=0;j<a[0].length;j++)
    {
        System.out.printf("%4d  ",a[i][j]);
    } System.out.println("");
} }
           else 
               System.out.println("MULTIPLICATION IS NOT POSSIBLE");
    }
}

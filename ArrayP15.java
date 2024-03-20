class ArrayP15//ADDITION OF TWO MATRIX 
{
    public static void main(String args[]){
           int a [][]=new int[3][3];
           int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
           int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
           for(int i =0;i<ar.length;i++)
           {
               for (int j=0;j<ar[0].length;j++)
               {
                   a[i][j]=ar[i][j]+arr[i][j];
               }
               System.out.println("");
           }
        for (int[] a1 : a) {
            for (int j = 0; j<a[0].length; j++) {
                System.out.printf(" %02d",a1[j]);
            }System.out.println("");
        }
                   
    }
}
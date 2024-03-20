class ArrayP3   
//MAX OF AN ARRAY 
{
    public static void main(String args[])
    {
        int ar[]={1,16,6,2,32};
        int s=ar[0];   
        int i;
        for(i=0;i<ar.length;i++)
        {
            if (ar[i]>s)
            {
                s=ar[i];
            }
          
        }System.out.println("THE MAX OF AN ARRAY IS "+s);
    }
}
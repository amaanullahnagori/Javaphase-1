class ArrayP12
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        int b[]=new int[2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        a=b;
        b=null;
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
class ArrayP10  //COPY OF AN ARRAY 
{public static void main(String args[])
{
    int a[]={1,2,3,4,5,6};
    int b[]=new int[6];
    for(int i=0;i<a.length;i++)
    {
        b[i]=a[i];
    }
    for(int x:b)
    {
        System.out.print(x+",");
    }
        }
        }
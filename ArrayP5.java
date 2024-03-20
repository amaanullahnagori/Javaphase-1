class ArrayP5// LEFT  ROTATION  OF AN ARRAY 
{
    public static void main(String args[])
    {
        int ar[]={5,9,6,10,12,7,3,5,4,2};
        int temp=ar[0];
        int i;
        for( i=0;i<ar.length;i++)
        {
            System.out.print (ar[i]+",");
        }
        System.out.println("");
        System.out.println("LEFT SHIFT :--");
        
        for( i=0;i<ar.length-1;i++)
        {   
            
            ar[i]=ar[i+1];
        }
        if(i==ar.length-1)
        {
            ar[i]=temp;
        }
          for( i=0;i<ar.length;i++)
          {
        System.out.print(ar[i]+",");
    }
    }
}
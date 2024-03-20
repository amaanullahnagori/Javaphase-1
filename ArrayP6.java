class ArrayP6 //RIGHT SHIFT OF ARRAY 
{
    public static void main(String[] args) {
        int a[]={4,5,6,1,2,3};
   int temp=a[a.length-1];
   int i;
   for(int x:a)
   {
       System.out.print(x+",");
   }  
        System.out.println("");
        System.out.println("THE RIGHT SHIFT IS:--");
   for(i=a.length-2;i>=0;i--)
   {  
       a[i+1]=a[i];
   }
   if(i==-1)
   {
       a[0]=temp;
   }
   for(int x:a)
   { 
       System.out.print(x+",");
}
        System.out.println("");
}
}

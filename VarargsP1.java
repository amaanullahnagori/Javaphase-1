class varargsP1
{
    public static void main(String args[])
    {  
       int d= max(4,9,8,6,2,1,3);
        System.out.println("The max among the given number is "+d);
// both the function will execut one by one
       int e= max(new int[]{7,8,56,4,7,6,2,6});
        System.out.println("The max among the given array is number is "+e);
// this is called flying array that is array without any refernce as soon as program is over it get vanishes.
  }
    static  int  max(int...a)  // int ...a is called variable argument to this we can give any
     {// number of input 
         int first=a[0];
         for(int i=0;i<a.length;i++)
         { 
             if(a[i]>first)
             {
                 first=a[i];
             }
             else
                 first=first;
         }
         return first ;
     }
}
class MethodP4 //MAX OF AN ARRAY USING METHOD 
        
{
    public static void main(String[] args) {
        int b[]={5,6,14,9,8};  
       int c=  max(b);
        System.out.println("THE MAX OF THE ARRAY IS "+c);
        System.out.println("THANK YOU");
    }
static int max( int a[]) 
    {
   int p=a[0];
   for (int i=0;i<a.length;i++)
   {
       if(p>a[i]) 
       p=p;
       else 
           p=a[i];
   }
       return p;
}
}

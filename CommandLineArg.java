class CommandLineArg
{
   public static void main(String[] a) {
   double s=0;
   for(int i=0;i<a.length;i++)
   {
       s=s+Double.parseDouble(a[i]);
   }System.out.println("the sum is "+s);
}
}
// this program should run in command prompt

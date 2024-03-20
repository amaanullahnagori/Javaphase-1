class MethodP2//poochna 
{
    public static void main(String[] args) {
  int number=45,fact=0;
  int ar[]=new int[10];
  for(int i=2;i<number-1;i++)
  {
      if(number%i==0)
      { 
          fact=i;
        //System.out.println(i);
      for(int j=0;j<3;)
      { 
          //System.out.println(i);
          ar[j]=fact;
       //   System.out.println(ar[j]);
       j++;
          System.out.println(j);
          break;
      }
  }
  }
  for(int x:ar)
           System.out.print(x);
   
}
}
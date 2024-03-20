class MethodP1
{
    public static void main(String args[])
    {  
        int n=10;
     boolean  c= isprime(n);
        System.out.println(" "+c);
    }
    static boolean isprime(int number)
    {
        //int number=45;
        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
        {
          return false;
          
        }
        }
      if(number==number/2+1)
       return true;
         return false;   //isse program ke answer prr koi farak nahi pad raha he 
    }
    }
           


class ArrayP8// BAHUT SARE DOUBT CLEAR KARNE WALA PROGRAM 
{
    public static void main(String[] args) {
   int a[]=new int[4];
    a[0]=2;
    a[1]=1;
    a[2]=3;
    a[3]=4;
   for(int i=0;i<a.length-1;i++)  // LENGTH -1 TAK ISLIYE CHALAYA KYUKI 
   // AGAR LENGTH TAK CHALATE TO VO A[4] =A[3] HO JATA 
       // JO POSSIBLE NAHI THA 
   {   a[i+1]=a[i];
 if(i==2)
 { break;}
      
    }
   //a[3]=5;
   //a[3]=5;
   
  // for(int x:a)
   {
      // System.out.print(x);
       
   }


   for(int i=0;i<a.length;i++)
   {
       System.out.println(a[i]);
   }
    }
}

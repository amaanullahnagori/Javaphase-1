import java.util.*;
class ArrayP9
{
    public static void main(String[] args) {
    int a[] =new int[5];
              a[1]=1;
              a[0]=2;
              a[2]=3;
              a[3]=4;
            
  //int ar[]={1,2,3,4,5};
  Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A INDEX :---");
        
  int index=sc.nextInt();
  if(index<a.length){
  for(int i=index;i<a.length-1;i++)
  {
      a[index]=a[index+1];
  }
  
}
   else 
  { System.out.println("INVALID INDEX");
  System.exit(0);
}
  for(int x:a)
  {
      System.out.print(x+",");
  }
 
    }
}

class ArrayP11  //COPY OF AN ARRAY  IN REVERSE 
{public static void main(String args[])
{ int z;
    int a[]={1,2,3,4,6};
    int b[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
        for( z=b.length-1-i;z>=0;z--)
        {
        b[z]=a[i];
      break;
// IF YOU DON'T USE THE BREAK THEN ALSO YOU WILL GET THE
 //SAME RESULT BUT IT WILL MAKE PROCESS LONG . IT WILL CHECK ALL THE VALUES OF Z AND REPLACE THAT VALUE FOR THE ANOTHER OF Z 
        }
    }
    System.out.println("THE ARRAY IS ");
    
    for(int x:a)
    {
        System.out.print(x+",");
    }
    System.out.println("");
    System.out.println("THE REVERSE ARRAY IS");
    for(int x:b)
    {
        System.out.print(x+",");
     
    }System.out.println("");
        }
        }
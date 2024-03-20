class String8
{
    public static void main(String args[])
    {
        String str1 ="Java";
        String str2="Java";
        String str4="hello";
        String str3=new String("Java");
/*whenever new is used an object is used object is created in thd heap 
with a reference str3 pointing toward it.
                               BUT
 when only string is decleared with some reference, here str1
 then an object is created in pool with a refernce pointing toward it in heap 
 if we use (==) operator then it compare where the reference is pointing
 if it is pointing toward same object in heap or pool then the output
 is true otherwise false also here we have to declared same stri
 literal if string litral is false then automatically it will give false.
        */
        boolean a=str1==str3;
        boolean b=str1.equals(str3);
        boolean c=str1==str4;
        boolean d=str1==str2;
        
        
        System.out.println(a);//f
        System.out.println(b);//t
        System.out.println(c);//f
        System.out.println(d);//t
        
    }
} 
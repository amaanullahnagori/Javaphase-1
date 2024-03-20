import java.lang.*;
class String1
{
    public static void main(String args[])
    {
        String str1="java is lub";
        System.out.println(str1); 
        str1="java";
        System.out.println(str1); 
        
    }
}
/*in this program you can see that variable(refernce) name as str1 is created 
with string as "java is lub".know for this an object is created in the pool to 
which str1 is pointing and know if i change the string to "java" with same 
variable then there will be no change in the previous string , new string is created with 
different address and the reference,here variable(str1) will going to point 
toward the new string and the previous string(java is lub)will be removed 
by garbage collecter present in JVM 
archietecture
*/
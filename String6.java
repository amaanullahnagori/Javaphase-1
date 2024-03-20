class String6
{
    public static void main(String args[])
    {
        String str1 ="Java";
        String str2="HELLO";
        String str3="JAVA";
        int a=str2.compareTo(str3);
        System.out.println(a);
        /*the string which is first used in method if its first alphabet 
        comes first according to dictionary as compare to second 
        then output is -(difference in there ASCII value)
        
        the string which is first used in method if its first alphabet 
        comes second according to dictionary as compare to seond string first
        alphabet
        then output is +(difference in there ASCII value)
        and if boyh the string are same then output is 0
   
        */
    }
}
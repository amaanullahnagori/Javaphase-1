class String10RE
        //regular expression(RE)
{
    public static void main(String args[])
    {
        String str1 ="a";
        String str2="v";
        String str3="7";
        boolean b =str1.matches(".");
        boolean c =str1.matches("[abc]");
        boolean d =str2.matches("[abc]");
        boolean e =str1.matches("[^abc]");
         boolean f =str2.matches("[^abc]"); 
         boolean g =str3.matches("[a-z 0-9]"); // a to z or 0 to 9
         boolean h =str3.matches("[a-z] [0-9]");// a to z and o to 9          
         boolean i =str1.matches("a|b"); 
        System.out.println(b);
        System.out.println(c);          
        System.out.println(d);
         System.out.println(e);
          System.out.println(f);
          System.out.println(g);
          System.out.println(i);
        
    }
}       
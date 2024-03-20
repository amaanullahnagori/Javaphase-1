class String2
{
    public static void main(String args[])
    {
        String str=new String("java");
        System.out.println(str);
         String str1 ="java";
         System.out.println(str1);
    }
}
/*
whenever a word new is used object is created in heap always and sometimes 
it is also created in pool.
b/c of str1 object is created in pool with string as "java"
so therefore java will going to creat an object in heap for str but
not going to creat it in pool because it is already existing in the pool
because of str1 "java"
*/ 
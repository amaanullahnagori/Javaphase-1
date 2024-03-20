class StringPractice4
{
    public static void main(String args[])
    {
        String str1="$$$ /java is lub 4 ever/ $$$";
        System.out.println(str1);
        String str2=str1.replaceAll("[^a-z 0-9]", "");
        System.out.println(str2);
        String str3=str1.replaceAll(" ", "");
        String str4=str3.replaceAll("[^a-z 0-9]", "");
        System.out.println(str4);
        
        
        
    }
}
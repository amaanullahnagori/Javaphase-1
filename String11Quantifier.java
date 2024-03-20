
class String11Quantifier

 {
     public static void main(String args[])
     {
         //Scanner sc= new Scanner(System.in);
         String str="asdaasdas";
         //System.out.println("enter the string");
        // str=sc.nextLine();
         boolean a=str.matches(".*");
    boolean b= str.matches("[abc]*");/*abc me se hi hona 
                                     chahiye kitni bhi baar*/
    boolean c=str.matches("[asd]*");
    boolean d=str.matches("[asd]{3,5}");//{3,5} ka amtlab he ki kya length 
                                        // 3 se 5 ke beech me he?
     boolean e=str.matches("[asd]{0,10}");
          boolean f=str.matches("[asd]{9}");//{9} represent string length 
    System.out.println(a);
    System.out.println(b);
     System.out.println(c);
      System.out.println(d);
      System.out.println(e);
         System.out.println(f);
      
    
         
     }
 }
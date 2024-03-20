import java.lang.*;
class FormetSpecifier1
{
    public static void main(String args[])
    {
        int a=45;
        float u=7.3232f;
        String str="hello";
       //System.out.printf("%1d\n",a);
       System.out.printf("%8.2f\n%d\n%7s \n",u,a,str);
       System.out.printf("%08.2f\n",u);
     
      /* 08.2
       here,  .2 signify that take two digit after the decimal 
               8 signify that take the space for 8 digit till the second place of decimal
               0 signify that where awer there is a empty space put 0 there 
       for more clarification you can run the program
        */
    }
}/*here using 7 in front of s means that it will take space of 7 in which 
5 space is going to be occupy by word hello and remaing will be given as space
*/ 
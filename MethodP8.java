import java.util.*;   // FINDING AREA BY GIVING PARAMETER 
class MethodP8
{  
    
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
      
       System.out.println("WHICH SHAPE AREA YOU WANT TO FIND ?");
       System.out.println("PRESS 1) FOR CIRCLE \nPRESS 2) FOR RECTANGLE");
        int input = sc.nextInt();
        switch(input)
        {
            case 1:
            System.out.println("ENTER THE RADIUS");
             int radius =sc.nextInt();
            double c= area(radius);
            System.out.println("THE AREA OF CIRCLE IS :- "+c);
            System.out.println("THANK YOU ");
                    break;

            case 2:
                System.out.println("ENTER THE LENGTH AND BREATH OF RECTANGLE");
             float length =sc.nextFloat();
                 float breath =sc.nextFloat();
                 float r=  area(length,breath);
                System.out.println("THE AREA OF RECTANGLE IS :- "+r);
                  System.out.println("THANK YOU ");
                  break;
            default:
                System.out.println("INVALID NUMBER");
        }
      }
    static double area( int r)
        {
            double area=Math.PI*r*r;
            System.out.println(area);
            return area ;
        }
        static float area(float r ,float s)
        {
            Scanner sc=new Scanner(System.in);
                             float area =r*s;
                 return area;             
}
}
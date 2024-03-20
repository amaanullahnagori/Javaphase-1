import java.util.*;   // FINDING AREA WITHOUT GIVING PARAMETER 
class MethodP7
{  
    
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
      
       System.out.println("WHICH SHAPE AREA YOU WANT TO FIND ?");
       System.out.println("PRESS 1) FOR CIRCLE \nPRESS 2) FOR RECTANGLE");
        int input = sc.nextInt();
        switch(input)
        {
            case 1:
            double c= circle();
            System.out.println("THE AREA OF CIRCLE IS :- "+c);
                circle();
                System.out.println("THANK YOU ");
                break;
            case 2:
                float r=  rectangle();
                System.out.println("THE AREA OF RECTANGLE IS :- "+r);
                  System.out.println("THANK YOU ");
                  break;
            default:
                System.out.println("INVALID NUMBER");
        }
      }
      
     static double circle()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER THE RADIUS");
             int radius =sc.nextInt();
           double area=Math.PI*radius*radius;
            System.out.println(area);
            return area ;
        }
        static float rectangle()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER THE LENGTH AND BREATH OF RECTANGLE");
             float length =sc.nextFloat();
                 float breath =sc.nextFloat();
                 float area =length*breath;
                 return area;
             
}
}
import java.util.*;
public class QuadraticEquation {

   
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the coefficiant of x^2");
        a=sc.nextInt();
        System.out.println("enter the coefficiant of x");
        b=sc.nextInt();
        System.out.println("enter the constant");
        c=sc.nextInt();
          double d1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
          double d2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
          
        System.out.println("the roots are "+d1);
        System.out.println("the roots are "+d2);

    }
    
} 
 
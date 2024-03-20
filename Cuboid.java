import java.util.*;
import java.lang.*;
class Cuboid
{
    public static void main (String args[])
    { 
    float length;
    float breath;
    float height;
    Scanner sc =new Scanner(System.in);
    length=sc.nextFloat();
    breath=sc.nextFloat();
    height=sc.nextFloat();
    double Volume=length*breath*height;
    double Base_Area=height*length;
    System.out.println("the volume is "+Volume);
    System.out.println("the volume is "+Volume);
    System.out.println("the volume is "+Base_Area);
     }
}
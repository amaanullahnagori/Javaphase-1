import java.lang.*;
class BitwiseOperater
{
    public static void main(String args[]){
        int a=10;
        int b=4;
        System.out.println("for AND & "+(a&b));
        System.out.println("for OR |  "+(a|b));
        System.out.println("for NOR ^ "+(a^b));
        
     //10-----1010
     //4------0100
     //10|4---1110=14
     //10&4---0000=00
     //10^4---1110=14
    }
    
        
        }
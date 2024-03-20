//reversing a number  usin method 
class MethodP9
{
    public static void main(String[] args) 
    {
        int a=732;
       int q= reverse(a);
        System.out.println("The Reverse of a number is "+q);
    }
    static int reverse(int x)
    {
                int q=0;
        while (x>0)
        {  
    
            int r=x%10;
            x=x/10;
            q=q*10+r;
        }
        return q;
    }
}
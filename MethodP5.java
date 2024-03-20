class MethodP5
{
    public static void main(String args[])
    {
        float a;
        float b=10f,c=7.f,f=89f;
        a=add(b,c);
        System.out.println(a);
    }
    static int  add(int x,int y)
   {
       int c=x+y;
       return c;
   }
    static float add(float x,float y)
    {
        float c=x+y;
        return c;
    }
    
}
class FSArgument3
{ //FS is refer to formet specifier 3 means 3rd part
    public static void main(String args[])
    {
        int a= 10;
        float y= 2.25f;
        String str="jaavaaaaa";
        System.out.printf("%1$s %3$f %2$d",str,a,y);
        System.out.printf("\n%3$s %2$f %1$d\n",a,y,str);
    } 
}                   
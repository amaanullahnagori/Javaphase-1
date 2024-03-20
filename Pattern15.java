class pattern13
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=4;j++)
            {
                int k=i+j;
                switch(k)
                {
                    case 2:
                    System.out.print(" ");
                    break;
                    case 3:
                    System.out.print(" ");
                    break;
                    case 4:
                    System.out.print(" ");
                    break;
                    default:
                    System.out.print("* ");
                    break;
                }
            }
            System.out.println("");
        }
        {
            System.out.println(""); 
            for(int x=1;x<=4;x++)
        {
            for (int y=1;y<=4;y++)
            {
                int o=y+x;
                switch(o)
                {
                    case 2:
                    System.out.print(" ");
                    break;
                    case 3:
                    System.out.print(" ");
                    break;
                    case 4:
                        System.out.print(" ");
                    break;
                    default:
                    System.out.print("*");
                    break;
    }
}
            System.out.println("");
        }
    } 
}
}

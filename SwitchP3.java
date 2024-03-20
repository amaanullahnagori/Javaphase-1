import java.util.*;
class SwitchP3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.substring(0, str.indexOf(":"));
        switch(str1)
        {
            case "http":
                System.out.println("hypertext transfer protocol");
                break;
            case "ftp":
                System.out.println("file transfer protocol");
                break;
            case "https":
                    System.out.println("hypertext transfer protocol secured");
                    break;
            default:
                System.out.println("invalid");
        }
    }
}
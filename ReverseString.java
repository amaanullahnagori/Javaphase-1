import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("<-----ENTER THE STRING----->");
        String str1 =sc.nextLine();
        String str2[]=str1.split(" ");
        //System.out.println(str2.length);

//        for (int i=str2.length-1;i>=0;i--)
//        {
//            System.out.print(str2[i]+"");
//
//        }
        for (int i=0;i<str2.length;i++)
        {
         String str3=""+str2[i]+" ";

         String str4[]=str3.split("");
         for (int j=str4.length-1;j>=0;j--)
         {
             System.out.print(str4[j]+"");
         }


        }

    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amaan
 */
import java.util.*;
public class Pattern12 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
       for( int i=1;i<=n;i++)
       {
           for(int s=1;s<=n-i;s++)
           {
               System.out.print(" ");
           }
           {
           for(int j=1;j<=i;j++ )
           {
               System.out.print("*");
           }
           } System.out.println("");
       }

    }
    
}

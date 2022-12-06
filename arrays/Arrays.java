/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author dhanesh
 */
import java.util.Scanner;
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,total=0,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of subject");
        n=sc.nextInt();
         int marks[]=new int[n];
         for(int i=0;i<n;i++)
         {
             marks[i]=sc.nextInt();
             total=total+marks[i];
         }
         System.out.println("total is"+total);
    }
}
      
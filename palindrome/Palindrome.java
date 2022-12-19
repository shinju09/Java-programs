/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

/**
 *
 * @author dhanesh
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String var="RACECAR";
         String var1=var.toLowerCase();
         String var2="";
         for (int i=var.length()-1;i>=0;i--)
             var2=var2+var.charAt(i);
         {
             System.out.println(var1);
         }
         if(var2.equals(var))
         {
       System.out.println("palidrome");       
    }
         else
         {
             System.out.println("not palidrome");  
         }
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse1;

/**
 *
 * @author dhanesh
 */
public class Reverse1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sm="MATHEMATICS";
        String sm1=sm.toLowerCase();
        String sm2="";
        for(int i=sm1.length()-1;i>=0;i--)
            sm2=sm2+sm1.charAt(i);
        System.out.println(sm2);
    }
    
}

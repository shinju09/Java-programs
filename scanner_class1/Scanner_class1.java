/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner_class1;

import java.util.*;
public class Scanner_class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("welcome to ict atm");
        System.out.println("Enter the amount");
        int amount=in.nextInt();
        System.out.println("Enter the pin");
        int pin =in.nextInt();
        System.out.println("Thanks for using ict atm");
        System.out.println("amountyou have withdraw is"+amount);
        in.close();
        

    }
    
}

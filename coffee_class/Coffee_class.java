/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffee_class;

/**
 *
 * @author dhanesh
 */
public class Coffee_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     hotcoffee latte=new hotcoffee("latte","brown","hot");
     hotcoffee cappuccino=new hotcoffee("cappuccino","brown","hot");
     coldcoffee icedmocha=new coldcoffee("icedmocha","brown");
    
    
        System.out.println(icedmocha.temperature);
        cappuccino.taste();
        icedmocha.taste();
        
    }
}

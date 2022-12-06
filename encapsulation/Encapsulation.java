/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author dhanesh
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        information obj=new information();
        obj.setusername("admin");
        obj.setpassword(12345);
        System.out.println(obj.getusername());
        System.out.println(obj.getpassword());
    }
    
}

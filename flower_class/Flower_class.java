/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flower_class;

/**
 *
 * @author dhanesh
 */
public class Flower_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     dayflower hibiscus =new dayflower("hibiscus","red",4);
     hibiscus.bloom();
     System.out.println(hibiscus.color);
    
    moonflower datura =new moonflower("datura","white");
    datura.bloom();
    System.out.println(datura.name);
    System.out.println(datura.color);
    }
   
   
    
    
    
    
    
    
}

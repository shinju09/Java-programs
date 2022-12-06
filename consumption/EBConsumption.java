/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eb.consumption;

/**
 *
 * @author dhanesh
 */
import java.util.Scanner;
public class EBConsumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unit;
        float amount;
        Scanner eb=new Scanner(System.in);
        System.out.println("welcome");
         System.out.println("enter your unit");
         unit=eb.nextInt();
         if(unit<100)
         {
             amount=unit*2;
             System.out.println("The amount is"+amount);
         }
         else if(unit>100&&unit<=500)
             {
             amount=200+((unit-100)*5);
             System.out.println("The amount is"+amount);
         }
             
       else 
             {
             amount=2200+((unit-500*10));
             System.out.println("The amount is"+amount);
             } 
         
             
             
                     
             
         
    
        
    
             }   
    }
    
         
       
         
             
         
       
            
        
        
        
    
    


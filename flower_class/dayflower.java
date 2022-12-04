/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flower_class;

/**
 *
 * @author dhanesh
 */
public class dayflower extends flower {
  
    
   public dayflower(String name,String color,int petals)
   {
        super.color=color;
        super.name=name;
        
        super.petals=petals;
      
    }
    void bloom()
    {
        System.out.println("this flower blooms in the morning");
    }
    
}

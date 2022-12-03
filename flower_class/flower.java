/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flower_class;

/**
 *
 * @author dhanesh
 */
public class flower {
    
    String name;
    String color;
    int petals;
    void bloom()
    {
        System.out.println("flowers bloom");
    }   
 public class dayflower extends flower{
    String biologicalname;
   public dayflower(String name,String color,int petals)
    {
        super.color=color;
        super.name=name;
        this.biologicalname=biologicalname;
        super.petals=petals;
        
    }
    void bloom()
    {
        System.out.println("this flower blooms in the morning");
    }
     public class moonflower extends flower{
       public moonflower(String name, String color){
            super.color=color;
            super.name=name;
        }
        void bloom()
        {
            System.out.println("this flower bloom in the night");
        }
    }
            
            
    
        
    
}    
    


 
}

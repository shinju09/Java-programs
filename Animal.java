/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass.and.object;

/**
 *
 * @author dhanesh
 */
public class Animal {
    String name;
    String apperance;
    String size;
    String live;
    void running()
    {
        System.out.println("Animal will run");
    }
    void playing()
    {
        System.out.println("Animal will play");
    }
    }
class rabbit extends Animal
{ 
    rabbit()
    {
        super.name="bunny";
        super.live="borrow";
    }
    rabbit(String name1, String place)
    {
        super.name=name1;
        super.live=place;
    }
    String rabbit_live;
    void rabbit_live()
    {
        System.out.println("rabbit live in borrow");
                
    }
    void rabbit_live(String forest)
    {
        System.out.println("rabbit live in forest");
    }
    void running()
    {
        System.out.println("rabbit run very fastly");
    }
}      
    

 
   

    

    


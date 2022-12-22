/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffee_class;

/**
 *
 * @author dhanesh
 */
public class coldcoffee extends coffee {
    String temperature="cold";
    public coldcoffee(String name,String color)
    {
        super.name=name;
        super.color=color;
    }
    void taste()
    {
        System.out.println("taste are very good");
    }
}

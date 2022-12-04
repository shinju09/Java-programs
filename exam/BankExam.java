/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank.exam;

/**
 *
 * @author dhanesh
 */
import java.util.Scanner;
public class BankExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mark;
        Scanner in=new Scanner(System.in);
        System.out.println("welcome to ibps dashboard");
        System.out.println("Enter your mark");
        mark=in.nextInt();
        if(mark<50)
        { 
            System.out.println("not selected");
        }
        else if(mark>50&&mark<60)
            { 
            System.out.println("waiting list");
        }
          else
            { 
            System.out.println("selected");
        }      
    }
    
}

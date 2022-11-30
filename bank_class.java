/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank_class;

/**
 *
 * @author dhanesh
 */
public class Bank_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bank icici=new bank();
        icici.bank_name="icici";
        icici.interest=7;
        icici.display_interest();
        bank sbi=new bank();
        sbi.bank_name="sbi";
        sbi.interest=8;
        sbi.display_interest();
        bank iob=new bank();
        iob.bank_name="i0b";
        iob.interest=9;
        iob.display_interest();
        
        
        
    }
    
}

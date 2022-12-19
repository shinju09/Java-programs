/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duplicate.value;

/**
 *
 * @author dhanesh
 */
public class DuplicateValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String var="communication";
       int length=var.length();
       char  a[]=var.toCharArray();
       for ( int i=0;i<length;i++){
           for (int j=i+1;j<length;j++){
               if(a[i]==a[j])
               {
                   System.out.println("the duplicate values are    "+a[j]);
                  break; 
               }
           }
       }
    }
    
}

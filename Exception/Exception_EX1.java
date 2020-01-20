
package javaapplication6;

import javax.swing.JOptionPane;

public class Exception_EX1 {
   
    public static void main(String[] args){
        
        
       
           
       try {
             int totaol = 10/0;
            System.out.println(totaol);
       
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"Error You Cant Divide Number By 0");
        }
        
        
        
        
        
    }
   
    
}

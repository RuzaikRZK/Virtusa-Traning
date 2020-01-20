
package javaapplication6;

import javax.swing.JOptionPane;


public class Exception_EX2 {

    public int Devider(int number, int Divider) throws ArithmeticException {

        int d = number / Divider;
        return d;

    }

}

class Test{
    public static void main(String[] args) {
        
       
        
        try {
             Exception_EX2 e = new Exception_EX2();
        e.Devider(10,0);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"You can divide number by 0");
        }
        
        
    }


}

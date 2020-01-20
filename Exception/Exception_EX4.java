
package javaapplication6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Exception_EX4 extends Exception {

    public Exception_EX4(String message) {
        super(message);

    }

}

class Cal {

    public int Divide(int number, int Divider) throws Exception_EX4 {

        int total = number / Divider;

        return total;

    }

}

class Test_Cal {

    public static void main(String[] args) throws Exception_EX4 {

        Cal c = new Cal();
        try {
            c.Divide(10, 0);

        } catch (Exception_EX4 ex) {
            //ex.printStackTrace();
            ex.printStackTrace();

        }

    }

}

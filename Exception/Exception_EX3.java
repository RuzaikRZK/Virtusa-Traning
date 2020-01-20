
package javaapplication6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Exception_EX3 extends Exception {

    Exception_EX3(String s) {

        super(s);

    }

}

class TestAccountNumber {

    static void CheckNumber(int number) throws Exception_EX3 {
        int Account_Number = 0077676;
        if (Account_Number == number) {
            System.out.println("Number Valided");
        } else {

            throw new Exception_EX3("Account Number Invalide Exception");

        }

    }
}

class Test_Exception {

    public static void main(String[] args) {

        try {
            TestAccountNumber t = new TestAccountNumber();
            t.CheckNumber(0077676);
        } catch (Exception_EX3 ex) {
            Logger.getLogger(Test_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

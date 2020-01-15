
public class Anonymouse_Class {

    private int TestVariable = 10;

    public void Display() {

        System.out.println("Display Sucess !");

    }

    public int GetTestVar() {
        return TestVariable;

    }

}

class Anonymouse {

    public void CreateAnonymousClass() {

        // creating the Anonymouse Class
        Anonymouse_Class a = new Anonymouse_Class() {

            @Override
            public void Display() {
                System.out.println("Display From Anonymouse class");
            }

            @Override
            public int GetTestVar() {
                return super.GetTestVar();
            }

        };
        a.Display();
        a.GetTestVar();
        System.out.println(a.GetTestVar());

    }

}

class Test {

    public static void main(String[] args) {

        Anonymouse a = new Anonymouse();
        a.CreateAnonymousClass();

    }

}


class Outer {

    private int x = 1;

    Inner getInner() {

        Inner inner = new Inner();
        return inner;

    }

    class Inner {

        int getX() {

            return x;

        }

    }

}

class test {

    public static void main(String[] args) {

        //Outer outer = new Outer();
        Outer.Inner inner = new Outer().getInner();
        System.out.println(inner.getX());

    }

}

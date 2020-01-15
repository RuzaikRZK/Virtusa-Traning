
class TestMemberOuter1 {

    private int data = 30;
   
    class Inner {

        public int GetData() {

            return data;

        }

    }

}

class test_Member {

    public static void main(String args[]) {

        TestMemberOuter1 t = new TestMemberOuter1();
       TestMemberOuter1.Inner in=t.new Inner();
       
     

        in.GetData();
        System.out.println(in.GetData());
        

    }
}

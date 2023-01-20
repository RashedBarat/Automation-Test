public class absOne extends abstractClass{

    @Override
    public void sound() {
        System.out.println("Abstract Test");
    }


    @Override
    public void test1() {
       // super.test1();
        System.out.println("bla bla bla!!!!");
    }

    public static void main(String[] args) {

        absOne obj = new absOne();       // Abstract class e obj create hoyy na
        abstractClass obj1 = new absOne();
        obj.sound(); // This class

        obj1.sound();

        obj1.test1();

    }
}

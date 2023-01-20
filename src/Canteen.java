public class Canteen extends SchoolClass{

    @Override
    public int costAct(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Canteen obj = new Canteen();
        int abcd = obj.costAct(5,5);
        System.out.println(abcd);
        obj.doorOpenAct();
        obj.fanAct();
        obj.doorCloseAct();
        obj.waterAct();

    }
}

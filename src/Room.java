public class Room extends SchoolClass{

    @Override
    public int costAct(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {

        Room obj = new Room();
        int abc = obj.costAct(1,2);
        System.out.println(abc);
        obj.doorOpenAct();
        obj.fanAct();
        obj.doorCloseAct();
        obj.waterAct();

    }

}

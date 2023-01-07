import java.util.Scanner;

public class OopClass {

    public void test(){
        System.out.println("Too Cold!!!");
    }
    public int Add(int x, int y){

        int sum1 = x + y;
       // System.out.println(sum);
        return sum1;

    }

    public int Sub(int x, int y){

        int sum2 = x - y;
        // System.out.println(sum);
        return sum2;

    }



    public static void main(String[] args) {

    OopClass obj = new OopClass();

    ///////////INPUT//////////////

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a String");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        // /////////INPUT//////////////

  //  obj.test();

    int aka1 = obj.Add(num1,num2);
        int aka2 = obj.Sub(num1,num2);

    System.out.println("This is Addition = " + aka1);
        System.out.println("This is Subtraction = " + aka2);

    }
}

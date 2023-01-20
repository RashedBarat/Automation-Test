import java.sql.Array;
import java.util.Scanner;

public class ArrayCall {

    public static void main(String[] args) {

        //int[] arrayInt = new int[];

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();

        int[] arrayInt = new int[num];

      //  System.out.println(arrayIntt);

        for (int i = 0; i < arrayInt.length; i++) {

           int input = reader.nextInt();
            arrayInt[i] = input;
           // System.out.println(arrayInt[i]);
        }
    }
}

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

      //  int number = 29;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a String");
        String num = reader.nextLine();

        String size;

        // switch statement to check size
        switch (num) {

            case "A":
                size = "Rashed is a Good Boy";
                break;

            case "B":
                size = "Bad Boy";
                break;

            // match the value of week
            case "C":
                size = "Tasnim Bhai is Great!!!";
                break;

            case "D":
                size = "Jani naaaaaaa!!!";
                break;

            default:
                size = "Hudaiiiii";
                break;

        }
        System.out.println("Size: " + size);
    }
}

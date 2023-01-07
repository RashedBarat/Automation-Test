public class PrimNumber {

    public static void checkPrime(int in) {

        if (in >= 0) {


            int i, flag = 0, m = 0;

            m = in / 2;

            if (in == 0 || in == 1) {

                System.out.println(in + " Is not a prime number!");
            } else {

                for (i = 2; i <= m; i++) {

                    if (in % i == 0) {
                        System.out.println(in + " Is not a prime number!");
                        flag = 1;
                        break;
                    }

                }

                if (flag == 0) {
                    System.out.println(in + " Is a prime number!");
                }
            }

        }else {
            System.out.println(in + " Is a Not prime number!");
        }

    }

    public static void main(String args[]){
        checkPrime(1);
        checkPrime(2);
        checkPrime(-6);
    }
}

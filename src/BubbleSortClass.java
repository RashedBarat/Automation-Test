import java.util.Scanner;
public class BubbleSortClass {
    public int[] F1() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Array Size: ");
        int num = reader.nextInt();

        int[] arraySize = new int[num];

        for (int i = 0; i < arraySize.length; i++) {
            int input = reader.nextInt();
            arraySize[i] = input;
            // System.out.println(arrayInt[i]);
        }
        return arraySize;
    }
    public int[] bFun(int F1[]) {
        int n = F1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (F1[j] > F1[j + 1]) {

                    int temp = F1[j];
                    F1[j] = F1[j + 1];
                    F1[j + 1] = temp;
                }
            }
        }
        return F1;
        /*  for(int k=0; k<n;k++){
              System.out.println(F1[k]);*/
          }
    public static void main(String[] args) {

        BubbleSortClass obj = new BubbleSortClass();
        int abc[] = obj.F1();
        int[] sorting = obj.bFun(abc);

        for (int k = 0; k < sorting.length; k++) {
            System.out.println(sorting[k]);
        }
    }
}

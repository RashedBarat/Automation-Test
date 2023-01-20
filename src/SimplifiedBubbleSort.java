import java.util.Scanner;
public class SimplifiedBubbleSort {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Array Size: ");
        int num = reader.nextInt();

        int[] arraySize = new int[num];

        System.out.println("Enter Array Value: ");

        for(int i =0; i < arraySize.length; i++){

            int input = reader.nextInt();
            arraySize[i] = input;
        }

        System.out.println("Printing my Normal Array.....");

        for (int j=0; j < arraySize.length; j++){

            System.out.println(arraySize[j]);
        }

        // Doing Bubble Sorting //

     //   int size = arraySize.length;

        for(int k=0; k < arraySize.length - 1; k++){
            for(int l=0; l < arraySize.length - k - 1; l++){

                if(arraySize[l] < arraySize[l + 1]){

                    int temporary = arraySize[l];
                    arraySize[l] = arraySize[l + 1];
                    arraySize[l + 1] = temporary;
                }
            }
        }

        System.out.println("Printing my Bubble Sort Array Large to Small.....");

        for (int j=0; j < arraySize.length; j++){

            System.out.println(arraySize[j]);
        }

        for(int k=0; k < arraySize.length - 1; k++){
            for(int l=0; l < arraySize.length - k - 1; l++){

                if(arraySize[l] > arraySize[l + 1]){

                    int temporary = arraySize[l];
                    arraySize[l] = arraySize[l + 1];
                    arraySize[l + 1] = temporary;
                }
            }
        }

        System.out.println("Printing my Bubble Sort Array Small to large.....");

        for (int j=0; j < arraySize.length; j++){

            System.out.println(arraySize[j]);
        }
    }
}

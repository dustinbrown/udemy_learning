package section9;

import java.util.Scanner;

/**
 * Created by dbrown on 1/22/17.
 */
public class Challenge1 {

    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        int[] sortedIntegers = sortIntegers(integers);
        printArray(sortedIntegers);

    }

    public static int[] getIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[length];
        System.out.println("Enter " + length + "integers\r");
        for (int i=0; i<length; i++){
            a[i] = Integer.parseInt(scanner.next());
        }

        return a;
    }

    public static void printArray(int[] array){
        for (int i=0; i <array.length; i++) {
            System.out.println("element " + i + ": " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        while (true) {
            boolean sortMade = false;
            for (int i=0; i <array.length; i++) {
                if (i + 1 == array.length) {break;}

                if (array[i] < array[i+1]) {
                    int oldArrayValue = array[i];
                    array[i] = array[i+1];
                    array[i+1] = oldArrayValue;
                    sortMade = true;
                }
            }
            if (!sortMade) { break;}
        }
        return array;
    }
}

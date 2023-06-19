package day06;

import java.util.Arrays;

public class ArraysCopyofDemo {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray1 = Arrays.copyOf(originalArray, 10);
        int[] newArray2 = Arrays.copyOf(originalArray, 3);

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < newArray1.length; i++) {
            System.out.print(newArray1[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < newArray2.length; i++) {
            System.out.print(newArray2[i] + "\t");
        }

    }
}

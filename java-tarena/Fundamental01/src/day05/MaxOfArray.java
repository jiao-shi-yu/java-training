package day05;

public class MaxOfArray {
    public static void main(String[] args) {
       int[] array = new int[10];
       for (int i = 0; i < array.length; i++) {
           array[i] = (int)(Math.random() * 100);
           System.out.print(array[i] + "\t");
       }

        /**
         * 找到该数组中的最大元素
         */
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\n该数组中最大元素的值为：" + max);

    }
}

package day06;

import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        // 给array随机赋值
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        // 控制台输出array中的元素
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        // 对数组array进行排序
        Arrays.sort(array);
        // 查看排序后的array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }




    }
}

package day06;

public class SystemArraycopyDemo {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = new int[6]; // {0, 0, 0, 0, 0, 0}

        /**
         * public native static void arraycopy(
         *     Ojbect src,  //源数组
         *     int srcPos,  //源数组的起始位置
         *     Object dest, //目标数组
         *     int destPos, //目标数组的起始位置
         *     int length   //要复制的长度
         * )
         */

        System.arraycopy(array1,0,array2,1,5);

        // 输出数组2中的元素，看看复制的怎么样
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
    }
}

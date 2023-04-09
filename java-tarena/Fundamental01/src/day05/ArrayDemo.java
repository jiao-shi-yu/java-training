package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 声明数组
         * 声明整形数组array, 包含 10 个元素，每个元素都是 int 类型。默认是用 0 来填充的。
         */
        int[] array = new int[10];

        /**
         * 初始化数组
         */
        int[] array1 = new int[3];
        int[] array2 = {1, 4, 7};
        int[] array3 = new int[]{1,4,7};
        int[] array4;
//        array4 = {1,4,7}; // 编译错误，只有在声明的同时，才可以使用数组字面量初始化。
        array4 = new int[] {1,4,7};

        /**
         * 获取数组长度
         */
        int length = array1.length;
        System.out.println("数组1的长度为：" + length);

        /**
         * 访问和修改数组中的元素
         */
        int number = array2[0];
        System.out.println("数组2中索引为0的数是："+number);
        array2[0] = 999;    // 把 999 赋值给数组中的第一个元素
        System.out.println("现在数组2中索引为0的数是："+array2[0]);
        /**
         * array2共有3个元素，索引分别是0, 1, 2; 当试图访问索引为3的元素时，由于超出数组实际包含的索引的边界，就会报异常
         */
//        array2[3] = 400; // ArrayIndexOutOfBoundsException， 数组索引超出边界异常


        /**
         * 使用for循环遍历数组中的元素
         * 然后可以进行赋值及获取值的操作
         */
        int[] finalArray = new int[10];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = (int)(Math.random() * 100); //给数组中的每个元素，赋一个0到99之间的随机整数值
        }
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + "\t"); // 输出数组中的每个元素
        }

    }
}

package day04;

public class WhileDemo {
    public static void main(String[] args) {
        /*
        示例1：使用while循环,输出5次行动是成功的阶梯
         */
        int times = 0;      // 循环变量的声明
        while (times < 5) { // 循环条件的判断
            System.out.println("行动是成功的阶梯"); // 循环体的执行
            times++;        // 循环变量的更新
        }
        System.out.println("over");
        /*
        示例2: 在控制台输出九九乘法表
        分析：横着打印，共9行， 每行从1开始，最大到行号
         */
        int a = 1, b;
        while (a <= 9) { // 行
            b = 1;
            while (b <= a) { // 1 * 9  = 1, 2 * 9 = 18, ...... 注意b可以等于a
                System.out.print( b + " * " + a +" = " + a*b +"\t");
                // 循环变量，不要忘了加一
                b ++ ;
            }
            // 打印完一行，换行
            System.out.println();
            // 外层循环变量也不要忘了加一
            a ++ ;
        }
    }
}

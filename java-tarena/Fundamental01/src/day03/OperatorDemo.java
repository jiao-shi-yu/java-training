package day03;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
        1. 算术运算符：+, -, *, /, %
         1)%:取模/取余，取计算结果的余数
         */
        System.out.println(5%2); // 商2余1
        System.out.println(8%2); // 商4余0 ——整除
        System.out.println(2%5); // 商0余2


        /*
         2)自增减运算符
         */
        int a = 5, b = 5;
        int c = a++; // c = 5, a = a + 1;
        int d = ++b; // ++b , b = 6; d = b = 6;

        System.out.println(a); //6
        System.out.println(b); //6
        System.out.println(c); //5
        System.out.println(d); //6

    }
}

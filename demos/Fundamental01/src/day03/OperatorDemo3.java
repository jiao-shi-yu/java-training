package day03;

public class OperatorDemo3 {
    public static void main(String[] args) {


        /*
         3)逻辑运算符
         */
        int a = 5, b = 10, c = 5;

        // && 且 有false则false
        boolean b1 = b >= a && b < c; // true && false => false
        System.out.println(b1);         //
        System.out.println(b <= c && b > a); // false && true => false
        System.out.println(a == b && c > b); // false && false => false
        System.out.println(a != c && a < b); // true && true => true

        // || 或 有true则true
        System.out.println(1<2 || 2<3); // true || true => true
        System.out.println(1<2 || 3>2); // true || false => true
        System.out.println(1>2 || 2<3); // false || true => true
        System.out.println(1>2 || 2>3); // false || false => false


        // ! 非 true变false, false变true
        System.out.println("----!-----");
        System.out.println(!true);  // false
        System.out.println(!false); // true


        /*
         逻辑运算符的短路特性
         */
        System.out.println("逻辑运算符的短路特性:");
        int j = 0 , k = 0;
        boolean b2 = j > k && j++ > k;
        System.out.println("j:"+j); // j:0, 前一个语句 j > k 为false, 后面 j++>k 未执行
        System.out.println("k:"+k); // k:0
        System.out.println(b2);
        System.out.println();
        boolean b3 = j == k && j++ > k; // 0==0 -> true; 0>0 -> false; true && false -> false;
        System.out.println("j:"+j); // j:1, 前一个条件为true, 后面语句j++>k才执行了
        System.out.println("k:"+k);
        System.out.println(b3);  // false 有趣
        System.out.println();

        int m = 0, n = 0;
        boolean l = m == n || m++ == n; // 0==0, true; m++ 不会执行
        System.out.println("m:"+m); //m:0
        System.out.println("n:"+n); //n:0

        boolean l2 = m > n || m++ == n; // 0>0, false; m++ == n, 会执行, m++ 的值为0, 后m的值自增为1, n为0.
        // 0 == 0, true; false || true , 结果为 true.

    }
}

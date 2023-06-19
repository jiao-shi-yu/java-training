package day02;

public class DateTypeDemo02 {
    public static void main(String[] args) {
        // 2) long:长整型，8个字节，可表示整数的范围很大
//        long a = 10_000_000_000; // 直接写整数，是int的字面量，而10_000_000_000太大了。integer number too large.
        // 长整型直接量需要在数字后加`L`
        long b = 10_000_000_000L;
        // 不同数据类型计算，结算结果的类型，以大的为准。
        long c = 100_000_000 * 2 * 10L; // 注意到c的数据类型为long, c的数值为20亿
        System.out.println(c);

        long d = 1_000_000_000*3*10L; // 10亿*3*10,结果为三百亿，但10亿*3的时候就已经发生了溢出。
        System.out.println(d);
        long e = 1_000_000_000L*3*10; // 如果在第一个因数就标明L, 则在long的范围内计算，不会发生溢出。
        System.out.println(e);


    }
}

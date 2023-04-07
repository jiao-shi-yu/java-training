package day02;

public class DataTypeDemo03 {
    public static void main(String[] args) {
        // 3)double:浮点型,8个字节，可以表示小数，表示数的范围很广，比float更精确。
        // 浮点型直接量默认为 double 类型
        double a = 3.25;
        float b = 3.25f;
        // 浮点型的舍入误差
        double c = 3.0, d = 2.9;
        System.out.println(c-d); //0.10000000000000009

        c = 6.0;
        d = 4.9;
        System.out.println(c-d);
    }
}

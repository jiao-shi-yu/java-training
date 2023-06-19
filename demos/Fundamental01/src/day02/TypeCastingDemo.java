package day02;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // 类型间的转换
        int a = 5;
        long b = a;  //自动类型转换
        int c = (int) b; //强制类型转换

        long d = 25;  //自动类型转化
        double e = 25; //自动类型转化
        System.out.println(d);
        System.out.println(e);

        // 范围大的类型强转范围小的类型，有可能发生溢出
        long f = 10_000_000_000L;
        int g = (int)f;
        System.out.println(g); //1410065408

        // 精度高的类型强转精度小的类型，有可能精度丢失
        double h = 25.987878745847583753985738538843457348573485345;
        int i = (int)h;
        System.out.println(i); //25
        float j = (float)h;
        System.out.println(j); //25.987879

    }
}

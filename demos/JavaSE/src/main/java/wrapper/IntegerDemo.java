package wrapper;

public class IntegerDemo {
    public static void main(String[] args) {
        int num = 128; // 基本类型
        Integer i1 = Integer.valueOf(num); // Integer的valueOf缓存1字节之内的整数对象
        Integer i2 = Integer.valueOf(num);
        System.out.println(i1 == i2);   // true, 重用了对象
        System.out.println(i1.equals(i2));

        double dou = 123.123;
        Double d1 = Double.valueOf(dou);
        Double d2 = Double.valueOf(dou); //Double数字太多，没有缓存的必要。直接new.
        System.out.println(d1 == d2);   // false,
        System.out.println(d1.equals(d2));

        int in = i1.intValue();
        System.out.println(in);
        double dd = i1.doubleValue();
        System.out.println(dd);

        // 包装类定义了两个常量用于获取取值范围
        int imax = Integer.MAX_VALUE;
        int imin = Integer.MIN_VALUE;
        System.out.println(imax);
        System.out.println(imin);



        String line = "123";
        num = Integer.parseInt(line);
        line = "123.123";
        dd = Double.parseDouble(line);
        System.out.println(dd);


    }
}

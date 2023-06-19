package object;

/**
 * 测试重写后的toString()和equals()方法
 */
public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        // 向控制台输出p对象
        System.out.println(p);
        /**
         * toString()方法是 Object 类中定义的重要方法，返回当前对象的字符串表示。
         * Object类中，这个方法的默认实现是：返回对象的地址信息，格式为：`类名@地址`。
         */
        String str = p.toString();
        System.out.println(str);

        Point p1 = new Point(1,1);
        Point p2 = new Point(1, 1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));


    }
}

package day06;

public class MethodDemo {

    public static void main(String[] args) {
        sayHello();
        sayHi("熊大");
        sayHi("熊二");
        sayHi("熊二", 6);
        int num1 = getARandomInt();
        System.out.println(num1);

        int num2 = getARandomInt(100, 200);
        System.out.println(num2);

        a();
    }


    // 声明一个无参数无返回值的方法
    public static void sayHello() {
        System.out.println("大家好！我是光头强，可以叫我强哥！");
    }

    // 声明一个有参数无返回值的方法
    public  static  void sayHi(String name) {
        System.out.println("大家好！我是" + name + "！");
    }

    // 方法也可以有多个参数
    public  static  void sayHi(String name, int age) {
        System.out.println("大家好！我是" + name + "！俺今年"+age+"岁咧。");
    }

    // 无参数有返回值的方法
    public static int getARandomInt() {
        return (int)(Math.random()*100);
    }

    // 有参数有返回值的方法
    public static int getARandomInt(int from, int to) {

        return (int)(Math.random()*(to - from)) + from;
    }

    public static void a() {
        System.out.println("method a() ......starting");
        b();
        System.out.println("method a() ......ending");
    }
    public static void b() {
        System.out.println("method b() ......");
    }
}

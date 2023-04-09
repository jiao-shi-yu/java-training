package day02;

public class ConstructorDemo {
    public static void main(String[] args) {
        // 分别调用两个构造方法，创建两个不同的实例
        Student zhangSan = new Student("张三", 19, "河北廊坊");
        Student somebody = new Student();

        // 调用成员方法
        zhangSan.study();
        zhangSan.sayHi();
        somebody.study();
        somebody.sayHi();
    }
}

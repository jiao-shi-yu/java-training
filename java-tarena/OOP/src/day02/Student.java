package day02;

public class Student {
    // 成员变量
    String name;
    int age;
    String address;

    /**
     * 构造方法
     * @param name
     * @param age
     * @param address
     */
    // 局部变量  String name, int age, String address
    Student(String name, int age, String address) {
        // this.name 访问成员变量
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 当你指定了构造方法后，编译器就不再提供默认的无参构造方法。
     * 这里我们写一个无参数的构造方法
     */
    Student() {
        // this(String, int, String) 是在调用上面写的那个构造方法
        this("未指定", 1, "未指定");
    }

    // 成员方法
    void study() {
        System.out.println(name + "在学习...");
    }
    void sayHi() {
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了，家住" + address);
    }

}

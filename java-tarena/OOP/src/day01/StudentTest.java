package day01;

public class StudentTest {
    public static void main(String[] args) {
        // 创建学生对象
        Student zhangSan = new Student();
        // 给成员变量赋值
        zhangSan.name = "张三";
        zhangSan.age = 25;
        zhangSan.address = "河北廊坊";
        // 调用方法
        zhangSan.study();
        zhangSan.sayHi();

        // 每个成员变量都有默认的赋值， int 类型的变量默认赋值是0，引用数据类型的成员变量默认赋值是null
        Student somebody = new Student();
        somebody.study();
        somebody.sayHi();
    }
}

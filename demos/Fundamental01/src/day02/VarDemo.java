package day02;
//变量的演示
public class VarDemo {
    public static void main(String[] args) {
        // 1)声明：相当于在银行开户
        int a; // 声明一个整型的变量，名为a
        int b,c,d; //声明三个整型变量，名为b,c,d
//        int a; // already defined in the scope, 编译错误，在这个域中已经声明了一个叫做a的变量

        // 2)初始化：相当于给账户存钱
        int e = 250; // 声明整型变量并赋值250
        int f; //先声明一个整型变量
        f = 250; //然后给变量赋值250
        f = 360; //再给它赋个别的值

        // 3)使用：使用的是账户里面的钱
        int g = 5;
        int h = g + 10; //取出g的值5, 把它加上10，然后把结果赋给h
        System.out.println(h); // 输出变量h的值
        System.out.println("h"); //输出字符串h
        g = g + 10; // g在本身基础上，增加10
        System.out.println(g);

//        System.out.println(i); // 编译错误，cannot resolve symbol 'i',无法解析符号
        int i;
//        System.out.println(i); // variable 'i' might have not been initialized,变量i可能还未被初始化


        // 4)命名：
        int a1, a_5$, _3c, $y;
//        int 1a; //1看成字面量

        int 年龄; //不建议 Non-ASCII characters
        int nianLing; //不建议，既不专业，又不直观
        int age; // 建议"英文的见名知意"
        int score, myScore, myJavaScore; // 小驼峰命名法

    }
}

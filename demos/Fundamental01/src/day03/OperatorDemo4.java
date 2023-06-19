package day03;

public class OperatorDemo4 {
    public static void main(String[] args) {

        /*
        4)赋值运算符
         */

        // 复合赋值运算符 a += 10; 相当于 a = a + 10;
        int a = 5;
        a += 10;
        System.out.println(a); //15
        a *= 2;
        System.out.println(a); //30

        short s = 5; // 整数字面量可以直接给 short 赋值
        s += 10;     // 复合赋值运算符，自带强转。
//        s = s + 10;  // short 进行计算时，先转成int,再参与计算。 计算结果是int型，而s是short型。
        s = (short)(s + 10);

        /*
        5)字符串连接符
        `+`除了用来做加法运算，还可以用来拼接字符串的。
         */
        int age = 18;
        System.out.println("age="+age);
        System.out.println("我今年"+age+"岁了");

        String name = "Ming";
        System.out.println("Hello!My name is "+name+" and I'm " + age + " years old.");

        // 字符串的同化作用
        System.out.println(20+20+""+30); //4030
        System.out.println(""+10+20+30); //102030
        System.out.println(10+20+30+""); //60


        /*
        6)三目运算符
         */

        int num1 = 8, num2 = 5;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);


    }


}

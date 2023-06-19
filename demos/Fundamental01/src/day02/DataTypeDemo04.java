package day02;

public class DataTypeDemo04 {
    public static void main(String[] args) {
        //4)boolean: 布尔型，1个字节
        boolean a = true;
        boolean b = false;
//        boolean c = 0; //布尔类型变量，只能存储true或false

        //5)char:字符型，2个字节
        char c1 = '女';
        char c2 = 'f';
        char c3 = '6';
        char c4 = '*';

        // 几个错误示例
//        char c5 = 女;   //字符字面量必须放在单引号中
//        char c6 = "女"; //双引号也不行
//        char c7 = '';   //必须有字符
//        char c8 = '女性'; //必须只有一个字面量

        char c9 = '\\';
        System.out.println(c9);

        char c10 = 65;
        System.out.println(c10); // 输出时会依据变量的数据类型来输出。
    }
}

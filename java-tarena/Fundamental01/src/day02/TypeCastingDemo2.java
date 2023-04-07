package day02;

public class TypeCastingDemo2 {
    public static void main(String[] args) {
        // 可表示范围内，直接量可以直接赋值给byte,short, int, long, char
        byte b1 = 5;

        // byte, short, char型数据参与运算时，一律先转换为int类型，之后再做运算.
        byte b2 = 6;
//        byte b3 = b1 + b2; //会报错，因为右边计算的结果是int类型。需强转。
//        byte b3 = (byte)b1 + (byte)b2; //这也错，需要用小括号，改变运算优先级。
        byte b3 = (byte) (b1 + b2);

        // 以下都是先转为int,然后再参与计算
        System.out.println(2+2);
        System.out.println(2+'2'); // '2' => char类型的字面量，对应int值为50
        System.out.println('2'+'2'); // 50 + 50 => 100

    }
}

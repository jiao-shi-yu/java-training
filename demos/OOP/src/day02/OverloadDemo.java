package day02;

public class OverloadDemo {
    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        /**
         * 编译器会根据**方法签名**，判断调用的是哪一个方法，自动绑定到具体的方法上。
         */
        aoo.show();
        aoo.show(19, "张三");
    }
}


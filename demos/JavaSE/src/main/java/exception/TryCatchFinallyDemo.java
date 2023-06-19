package exception;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "123";
            System.out.println(Integer.parseInt(str));
            return;
        } catch (Exception e) {
            System.out.println("出错了");
        } finally {
            System.out.println("finally中的代码执行了");
        }



        System.out.println("程序结束了");
    }
}

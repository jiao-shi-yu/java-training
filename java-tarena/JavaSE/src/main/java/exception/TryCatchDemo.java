package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。。。。");
        try {
//            String string = null;
//            String string = "";
            String string = "a";
            System.out.println(string.length());
            System.out.println(string.charAt(0));

            System.out.println(Integer.parseInt(string));

            System.out.println("这句话不会执行！！！！！");
//        } catch (NullPointerException e) {
//            System.out.println("出现了空指针！");
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("出现了字符串的下标越界");
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("出现了空指针或下标越界异常的统一解决办法！");
        } catch (Exception e) {
            System.out.println("反正就是出了个错！");
        }

        System.out.println("程序结束了。。。。。。");
    }
}

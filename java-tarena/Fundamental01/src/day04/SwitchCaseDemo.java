package day04;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int num = 2;
        /*
        switch 一开始只能对整型进行判断，jdk1.7后开始支持了byte,short,char,String
         */
        switch (num) {
            case 1: //(if num == 1)
                System.out.println("case 1");
                break;
            case 2:// 入口
                System.out.println("case 2");
                // 需要break跳出switch,不然后面都会执行
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default case");
        }
    }
}

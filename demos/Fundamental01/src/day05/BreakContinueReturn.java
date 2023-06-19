package day05;

public class BreakContinueReturn {
    public static void main(String[] args) {
        testContine();
        testBreak();
        testReturn();
        testBreakInNestedForLoop();
        testReturnInNestedForLoop();
    }
    private static void testContine() {
        System.out.println("-----------开始测试continue-----------");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("-----------continue循环外-----------");
    }

    private static void testBreak() {
        System.out.println("-----------开始测试break-----------");
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("-----------break循环外-----------");
    }

    private static void testReturn() {
        System.out.println("-----------开始测试return-----------");
        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("-----------return循环外-----------");
    }

    private static void testBreakInNestedForLoop() {
        System.out.println("-----------开始测试nested + break -----------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println("i:" + i + "; j:" +j);
                if (j == 3) {
                    break;
                }
            }
        }
        System.out.println("-----------nested循环外 + break -----------");
    }
    private static void testReturnInNestedForLoop() {
        System.out.println("-----------开始测试nested + return -----------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println("i:" + i + "; j:" +j);
                if (j == 3) {
                    return;
                }
            }
        }
        System.out.println("-----------nested循环外 + return -----------");
    }
}

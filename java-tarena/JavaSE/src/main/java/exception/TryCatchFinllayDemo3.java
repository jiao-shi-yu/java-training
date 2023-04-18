package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinllayDemo3 {
    public static void main(String[] args) {
        System.out.println(
                test("0") + "," + test(null) + "," +  test("")
        );
    }
    public static int test(String str) {
        try {
            return str.charAt(0) - '0';
        } catch (NullPointerException e) {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}

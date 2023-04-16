package demo;

public class LeftShiftDemo {
    public static void main(String[] args) {
        int n = 0x679f1b98;
        int m = n << 1;
        int k = n << 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
    }
}

package string.builder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String str = "好好学习java";
        //StringBuilder常见的构造器
        //默认内部维护一个空字符串
        StringBuilder builder = new StringBuilder();
        //传入一个字符串，将该字符串的内容复制一份传入builder当中
        StringBuilder builder1 = new StringBuilder(str);


        /**
         * 增添
         *
         * 好好学习java
         *    V
         * 好好学习java,为了找个好工作！
         *
         */
        builder1.append(",为了找个好工作！");
        System.out.println(str);  // String的内容是不变的
        System.out.println(builder1); // StringBuilder的内容是可变的


        /**
         * 修改
         * 好好学习java,为了找个好工作！
         *      V
         * 好好学习java,就是为了改变世界！
         */
        // 对索引为9到16(不包含16)的字符，进行替换
        builder1.replace(9,16,"就是为了改变世界");
        System.out.println(builder1);


        /**
         * 删除
         * 好好学习java,就是为了改变世界！
         *         V
         * ,就是为了改变世界！
         */
        // 删除索引0到8(不包含8)的字符
        builder1.delete(0,8);
        System.out.println(builder1);

        /**
         * 插入
         */
        builder1.insert(0, "活着");
        System.out.println(builder1);


        // 反转字符串内容
        builder1.reverse();
        System.out.println(builder1);

        // toString() 得到字符串
        String line = builder1.toString();
        System.out.println(line);

    }
}

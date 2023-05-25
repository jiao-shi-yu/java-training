package collection;

import java.util.*;

/**
 * 排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(getARandonPoint());
        list.add(getARandonPoint());
        list.add(getARandonPoint());
        list.add(getARandonPoint());
        list.add(getARandonPoint());
        System.out.println(list);

        /**
         * Compare .v 比较
         *
         * Comparable .adj 可比较的
         *
         * sort方法在进行排序时，要求集合元素必须实现Comparable接口，否则编译不通过
         * 上述做法对我们的代码有侵入性，尽量避免
         * 侵入性：当我们使用某个API的方法时，该方法要求我们为其修改其他额外代码，这个现象就是侵入性，它不利于程序后期维护。
         */


        /**
         * 比较器接口
         * 该接口要求实现方法：compare, 以定义比较规则。
         * 返回值的意义：
         *    返回值>0, o1 > o2
         *    返回值<0, 01 < o2
         *    返回值=0，o1 = o2
         *
         */
        Comparator<Point> comparator = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
                return len1 - len2;
            }
        };
        /*
            Java 23种设计模式之一：回调模式
            常见回调场景：
            文件过滤器：File.listFiles(FileFilter filter)
            集合排序： Collections.sort(List list, Comparator c)
            潜艇大战中，键盘鼠标等添加的监听器都是常见的回调模式。
         */
        Collections.sort(list, comparator);
        System.out.println(list);

        // 没有侵入性的写法：排序调用时，使用匿名内部类传入比较器
//        Collections.sort(list, new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX()*o1.getX() + o1.getY()*o1.getY();
//                int len2 = o2.getX()*o2.getX() + o2.getY()*o2.getY();
//                return len1 - len2;
//            }
//        });

        // 使用Lambda表达式的方式写
        Collections.sort(list, (o1, o2) ->
            o1.getX()*o1.getX() + o1.getY()*o1.getY() - o2.getX()*o2.getX() + o2.getY()*o2.getY()
        );


    }



    private static Point getARandonPoint() {
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        return new Point(x,y);
    }
}

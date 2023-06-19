package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素的equals方法对集合的很多操作产生影响
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        /**
         * 集合重写了toString()方法，输出的格式如下：
         * [元素1.toString(), 元素2.toString(), ...]
         *
         */
        System.out.println(c);

        Point p = new Point(1, 2);
        /**
         * boolean contains(Object o)
         * 判断当前集合是否包含给定元素，包含则返回true
         */
        boolean contains = c.contains(p);
        System.out.println("包含：" + contains);

        /**
         * boolean remove(Object o)
         * 删除集合中与给定元素equals比较为true的元素
         * 对于List这类可以存放重复元素的集合，若删除的元素有重复，仅删除一次
         */
        c.remove(p);
        System.out.println(c);
    }
}

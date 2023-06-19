package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection接口，有序可重复集。
 * 其提供了一套可以通过下标造作元素的方法。
 *
 * 常用实现类：
 * java.util.ArrayList: 内部使用数组实现，查询性能更好。
 * java.util.LinkedList: 内部使用链表实现，增删新能更好，首尾增删性能最佳。
 * 在对性能没有苛刻要求时，使用ArrayList即可。
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
        E get(int index)
        获取指定下标处对应的元素
         */
        String str = list.get(2);
        System.out.println(str);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*
        E set(int index, E e)
        替换元素操作
        将指定元素设置到指定位置上，返回该位置原有元素。
         */
        String old = list.set(2, "six");
        System.out.println(list);
        System.out.println("old:"+ old);


        // 集合翻转
        // [five, four, six, two, one]
        /**
         * 自己用for循环结合List的get,set方法来实现一下
         */
        for (int i = 0; i < list.size()/2; i++) {
            // 获取前面位置上的元素
            String s = list.get(i);
            // 将其替换到后面位置上, 并得到原来的数
            String oldStr = list.set(list.size()-1-i, s);
            // 把得到的数，赋值到前面
            list.set(i, oldStr);
        }
        System.out.println(list);

        /*
        Collections 集合的工具类，提供了一个reverse()方法，可以实现翻转。
         */
        Collections.reverse(list);
        System.out.println(list);
    }
}

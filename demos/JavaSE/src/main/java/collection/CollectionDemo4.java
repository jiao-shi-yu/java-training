package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1"+c1);

        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add("ios");
        System.out.println("c2"+c2);

        /*
        boolean addAll(Collection c)
        将给定集合中的所有元素添加到当前集合中，添加后，若当前集合发生了变化，则返回true.
         */
        c1.addAll(c2);
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);

        Collection c3 = new ArrayList();
        c3.add("c++");
        c3.add("ios");
        /*
        boolean containsAll(Collection c)
        判断当前集合是否全部包含给定集合中的所有元素。
         */
        boolean containsAll = c1.containsAll(c3);

        System.out.println("c3:" + c3);
        System.out.println("c1全包含c3:" + containsAll);

        // 这里将c3当成一个元素看待，判断c1里否含有一个元素是c3
        boolean contains = c1.contains(c3);
        System.out.println("c3属于c1:" + contains);

        /*
        删除交集部分，从c1中删除c3也有的元素。
         */
        System.out.println("c1:" + c1);
        c1.removeAll(c3);
        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);








    }
}

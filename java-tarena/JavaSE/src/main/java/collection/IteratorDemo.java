package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合提供了一个统一的遍历方式：迭代器模式
 * Iterator iterator()
 * 该方法可以获取一个迭代器，用来遍历当前集合。
 *
 * java.util.Iterator接口，迭代器接口，定义了遍历集合所需要的相关操作
 * 不同的集合类型，提供了不同的迭代器实现。
 *
 * 迭代器遍历集合元素，遵循的步骤：问， 取， 删。 其中，删除不是必要操作。但取之前一定要问。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        // 获取迭代器
        Iterator iterator = c.iterator();
        /*
        boolean hasNext()
        通过迭代器，询问集合否还有下一个元素。迭代器默认位置为集合中第一个元素之前。
        hasNext()方法，不会影响迭代器位置的变化，next()才会。

        E next()
        迭代器向后获取一个元素，并返回该元素。同时，位置向后移动"一格"。
         */
        while (iterator.hasNext()) {
            String str = (String)iterator.next();
            if ("#".equals(str)) {
                //  迭代器在遍历过程中，不要使用集合的方法，进行操作。
//                c.remove(str);
                // 迭代器提供的remove()方法，是删除迭代器当前位置的元素。
                iterator.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);

    }
}

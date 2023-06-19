package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Java集合框架
 * java.util.Collection接口，是所有集合的顶级接口，里面规定了所有集合都需要具备的功能
 * 集合与数组一样可以保存一组元素，但是维护元素的相关操作都封装成了方法，使用便捷。
 * 有多重不同的数据结构实现，更灵活地选取合适的集合类型操作数据。
 *
 * 常见子类型：
 * java.util.Set: 不可重复集合
 * java.util.List: 可重复集，有序。
 * 是否重复指的是：元素是否重复，比较标准：equals()方法 返回结果是否为true.
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        /**
         * boolean add(E e)
         * 向当前集合中添加一个元素，成功添加则返回true
         * 注意：集合只能存放引用类型元素，存放基本类型元素时会自动装箱为包装类
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /**
         * int size()
         * 返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:" + size);

        /**
         * boolean isEmpty()
         * 判断当前集合是否为空集（不含有任何元素）
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集：" + isEmpty);

        c.clear(); //清空集合
        System.out.println(c);
        System.out.println("size:" + c.size());
        System.out.println("是否为空集：" + c.isEmpty());

    }
}

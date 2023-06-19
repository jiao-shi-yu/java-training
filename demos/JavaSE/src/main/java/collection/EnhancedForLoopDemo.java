package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5推出了一个新特性：增强型for循环
 * 也称新循环，可以用相同的语法遍历数组和集合。
 * 新循环不去带传统循环的工作
 *
 * 语法：
 * for(元素类型 变量名:集合或数组名) {
 *     ...
 * }
 */
public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};

        for (String str : array) {
            System.out.println(str);
        } // 新循环会被编译器改为传统的for循环

        /*
        JDK5之后退出的一个新特性：泛型
        泛型也称为参数化类型，允许我们在使用一个类时，指定该类中，某个属性的类型、方法参数的类型，或返回值的类型。
        泛型在集合中广泛使用，用来指定集合中元素的类型。当我们不指定泛型的实际类型时，使用默认的原形Object。
         */
        // Collection<E> 定义集合时，指定了一个泛型，这里使用时指定为String。
        Collection<String> c = new ArrayList();
        c.add("一");
        c.add("二");
        c.add("三");
        c.add("四");
        c.add("五");
//        c.add(123); //类型不匹配时，编译不通过

        // 遍历时，可以直接使用泛型指定的类型接收元素，不用再手动造型了。
        for (String str : c) { //编译器会补充造型代码。
            System.out.println(str);
        }
        /**
         * 新循环遍历集合就是迭代器，编译器会改成迭代器遍历。如下
         * 迭代器也可以指定泛型，只要与其遍历的集合指定的泛型一致即可。
         */
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}

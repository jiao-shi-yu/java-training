package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类Arrays提供了一个静态方法asList,可以将一个数组转换为一个List集合。
 */
public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five", "six"};
        List<String> list = Arrays.asList(array);
        System.out.println("list:" + list);

        list.set(1, "seven");
        System.out.println("list:" + list);
        // 对该集合的操作就是对原数组的操作
        System.out.println("array:" + Arrays.toString(array));


        // 由于数组定长，因此对该集合增删元素是不支持的。
//        list.add("abc");//UnsupportedOperationException
        System.out.println("array:" + Arrays.toString(array));
        System.out.println("list:" + list);

        // 可以创建一个新List，然后将原来List的元素导入新List 这样两个list就不相干了
        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println("list1:" + list1);
        System.out.println("list:" + list);
        list1.remove(3);
        list1.add("666");
        System.out.println("list1:" + list1);

        // 创建集合的时候，传入一个集合。复制构造器
        // 这样创建一个新集合，就可以进行增删操作了。
        List<String> list2 = new ArrayList<>(list);
    }
}

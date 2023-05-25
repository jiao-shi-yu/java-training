package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collections提供了一个方法toArray,可以将当前集合转换为一个数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        System.out.println(collection);


        String[] array = collection.toArray(new String[collection.size()]);
        System.out.println(Arrays.toString(array));
    }
}

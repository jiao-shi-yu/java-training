package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合工具类：java.util.Collections
 * 提供了一个静态方法sort，可以对List集合进行自然排序(从小大大)
 */
public class SortListDemo1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        // 按照从大到小排列
        Collections.sort(list, (i1, i2)->i2-i1);
        System.out.println(list);
    }
}

package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集
 * List subList(int start, int end)
 * 获取子集，含头不含尾。
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        // 将子集每个元素扩大8倍
        // [30, 40, 50, 60, 70]
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i)*10);
        }
        System.out.println(subList);
        /*
         对子集的操作就是对原集合元素的操作。
         */
        System.out.println(list);

        // 将list集合中2-8删除
        list.subList(2,9).clear();
        System.out.println(list);
    }
}

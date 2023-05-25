package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("tom");
//        list.add("jerry");
//        list.add("rose");
//        list.add("jack");
//        list.add("Ada");
//        list.add("bill");
//        list.add("allen");
//        list.add("james");
        /*
        String 实现了Comparable接口，比较规则是：按照首字符unicode数字比较大小，若第一个字符相同，则继续比较第二个，以此类推。
         */
        list.add("范传奇");
        list.add("王克晶老师");
        list.add("刘苍松教研总监");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        /**
         * 我们亦可以重写一下这个比较规则，比如：按照字数多少排序，字数少的在前，字数多的灾后
         */
//        Collections.sort(list, (o1, o2) -> o1.length() - o2.length());
        Collections.sort(list, Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}

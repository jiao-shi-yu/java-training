package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue接口 队列
 * Queue继承自Collection.
 * 队列是经典数据结构，存取元素必须遵循先进先出原则。
 *
 * 常见实现类：
 * java.util.LinkedList
 *
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);


        // 出队操作，获取并删除
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        // 引用队首元素，获取后不会删除
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /*
        遍历队列
        使用迭代器遍历，元素不受影响，都还在队列中
         */
        for (String s: queue) {
            System.out.println(s);

        }

        // 用poll()方法遍历（一次性的）
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


    }
}

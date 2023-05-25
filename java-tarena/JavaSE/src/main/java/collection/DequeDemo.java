package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque 接口
 * Deque继承自Queue,双端队列的特点是：队列两端都可以做入队出队操作。
 * 常用实现类：java.util.LinkedList
 *
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);

        deque.offerFirst("four");
        System.out.println(deque);
        deque.offerLast("five");
        System.out.println(deque);


        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);
    }
}

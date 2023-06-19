package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，遵循后进先出的原则
 * 栈可以通过使用双端队列从同一侧做出入队来完成，因此双端队列也为栈提供了两个经典的方法：push()——入栈,pop()——出栈
 *
 * 实际开发中，我们经常使用栈来完成"后退""前进"这样的功能。
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);
    }
}

import unit4.collectionsLib.*;

import Queue.queue_size;
import Stack.stack_size;

public class Main {
    public static void main(String[] args) {

        // queueTest();
        // stackTest();

    }

    public static void queueTest() {
        Queue<Integer> q = new Queue<>();
        q.insert(0);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        System.out.println(queue_size.size2(q));
    }

    public static void stackTest() {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(stack_size.size2(s));
    }
}
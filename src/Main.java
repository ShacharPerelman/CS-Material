import Node.print_list;
import Node.sort_list;

import Queue.queue_size;

import Stack.stack_size;

import unit4.collectionsLib.Node;
import unit4.collectionsLib.Queue;
import unit4.collectionsLib.Stack;

public class Main {
    public static void main(String[] args) {

         nodeTest();
        // queueTest();
        // stackTest();

    }

    public static void nodeTest() {
        Node<Integer> lst =
                new Node<>(0,
                new Node<>(1,
                new Node<>(2,
                new Node<>(11,
                new Node<>(4,
                new Node<>(5,
                new Node<>(10)))))));

        print_list.printList3(lst);
        print_list.printList3(sort_list.sort3(lst));
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
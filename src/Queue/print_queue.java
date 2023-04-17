package Queue;

import unit4.collectionsLib.Queue;

public class print_queue {

    public static <T> void print_queue(Queue<T> q) {
        Queue<T> copy = clone(q);
        while (!copy.isEmpty())
            System.out.println(copy.remove() + " ");
    }

    private static <T> Queue<T> clone(Queue<T> q) {
        return null;
    }


}

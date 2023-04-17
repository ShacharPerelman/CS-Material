package Queue;

import unit4.collectionsLib.Queue;

public class queue_size {

    public static <T> int size1(Queue<T> q) {
        Queue<T> copy = clone(q);
        int size = 0;
        while (!copy.isEmpty()) {
            size++;
            copy.remove();
        }
        return size;
    }

    public static <T> int size2(Queue<T> q) {
        int size = 0;
        for (Queue<T> copy = clone(q); !copy.isEmpty(); size++)
            copy.remove();
        return size;
    }

    private static <T> Queue<T> clone(Queue<T> q) {
        return null;
    }
}

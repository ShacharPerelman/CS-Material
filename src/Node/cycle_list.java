package Node;

import unit4.collectionsLib.Node;

public class cycle_list {

    public static <T> Node<T> cycle(Node<T> lst, int k) {
        Node<T> cyclist = lst;
        Node<T> kholder = null;

        for (int i = 0; i < size(lst) - k; i++, cyclist = cyclist.getNext())
            kholder = new Node<>(cyclist.getValue(), kholder);

        for (Node<T> iter = reverse(kholder); iter != null; iter = iter.getNext())
            cyclist = new Node<>(iter.getValue(), cyclist);

        return reverse(cyclist);
    }

    private static <T> Node<T> reverse(Node<T> lst) {
        return null;
    }

    private static <T> int size(Node<T> lst) {
        return 0;
    }

}

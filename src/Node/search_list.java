package Node;

import unit4.collectionsLib.Node;

public class search_list { // Verified

    public static int min(Node<Integer> lst) {
        int min = Integer.MAX_VALUE;

        for (Node<Integer> iter = lst; iter != null; iter = iter.getNext())
            if (iter.getValue() < min)
                min = iter.getValue();

        return min;
    }

    public static int max(Node<Integer> lst) {
        int max = Integer.MIN_VALUE;

        for (Node<Integer> iter = lst; iter != null; iter = iter.getNext())
            if (iter.getValue() > max)
                max = iter.getValue();

        return max;
    }

    public static <T> boolean find(Node<T> lst, T x) {
        for (Node<T> iter = lst; iter != null; iter = iter.getNext())
            if (iter.getValue().equals(x))
                return true;

        return false;
    }
}

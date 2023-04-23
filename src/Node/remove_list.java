package Node;

import unit4.collectionsLib.Node;

public class remove_list { // Verified

    public static <T> Node<T> remove1(Node<T> lst, T x) {
        if (lst == null) return null;
        else if (!lst.hasNext()) return null;

        Node<T> ls = null;

        for (Node<T> iter = lst; iter != null; iter = iter.getNext()) {
            if (iter.getValue().equals(x))
                iter = iter.getNext();
            if (iter == null)
                break;
            ls = new Node<>(iter.getValue(), ls);
        }

        ls = reverse_list.reverse1(ls);

        return ls;
    }

    public static <T> Node<T> remove2(Node<T> lst, T x) {
        if (lst == null) return null;
        else if (!lst.hasNext()) return null;

        Node<T> ls = null;
        Node<T> iter = lst;

        while (iter != null) {
            if (iter.getValue().equals(x))
                iter = iter.getNext();
            if (iter == null)
                continue;
            ls = new Node<>(iter.getValue(), ls);
            iter = iter.getNext();
        }

        ls = reverse_list.reverse1(ls);

        return ls;
    }

}

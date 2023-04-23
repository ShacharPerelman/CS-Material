package Node;

import unit4.collectionsLib.Node;

public class sort_list { // Verified

    public static Node<Integer> sort1(Node<Integer> lst) {
        if (lst == null) return null;
        else if (!lst.hasNext()) return lst;

        Node<Integer> sorted_lst = null;
        Node<Integer> iter = lst;

        while (iter != null) {
            int m = search_list.max(iter);
            sorted_lst = new Node<>(m, sorted_lst);

            Node<Integer> jter = iter;
            iter = null;

            while (jter != null) {
                if (jter.getValue() == m)
                    jter = jter.getNext();
                if (jter == null)
                    continue;
                iter = new Node<>(jter.getValue(), iter);
                jter = jter.getNext();
            }
        }

        return sorted_lst;
    }

    public static Node<Integer> sort2(Node<Integer> lst) {
        if (lst == null) return null;
        else if (!lst.hasNext()) return lst;

        Node<Integer> sorted_lst = null;

        int m = search_list.max(lst);
        Node<Integer> iter = lst;
        for (Node<Integer> jter = iter; iter != null; m = search_list.max(iter), jter = iter) {
            sorted_lst = new Node<>(m, sorted_lst);

            for (iter = null; jter != null; iter = new Node<>(jter.getValue(), iter), jter = jter.getNext()) {
                if (jter.getValue() == m)
                    jter = jter.getNext();
                if (jter == null)
                    break;
            }
        }

        return sorted_lst;
    }

    public static Node<Integer> sort3(Node<Integer> lst) {
        if (lst == null) return null;
        else if (!lst.hasNext()) return lst;

        Node<Integer> sorted_lst = null;
        int m = search_list.max(lst);

        for (Node<Integer> iter = lst; iter != null; iter = remove_list.remove1(iter, m), m = search_list.max(iter))
            sorted_lst = new Node<>(m, sorted_lst);

        return sorted_lst;
    }

}

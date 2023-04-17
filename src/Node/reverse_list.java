package Node;

import unit4.collectionsLib.Node;

public class reverse_list {

    public static <T> Node<T> reverse1(Node<T> lst){
        Node<T> rev = null;

        for (Node<T> iter = lst; iter != null; iter = iter.getNext())
            rev = new Node<T>(iter.getValue(), rev);
        return rev;
    }

    public static <T> Node<T> reverse2(Node<T> lst){
        Node<T> ret = null;
        Node<T> pos = lst;

        while (pos != null) {
            ret = new Node<>(pos.getValue(), ret);
            pos = pos.getNext();
        }
        return ret;
    }

}

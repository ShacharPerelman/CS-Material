package Node;

import unit4.collectionsLib.Node;

@SuppressWarnings("unused")
public class list_size {

    public static <T> int size1(Node<T> lst) {
        int count = 0;
        for (Node<T> curr = lst; curr != null; curr = curr.getNext())
            count++;
        return count;
    }

    public static <T> int size2(Node<T> lst) {
        Node<T> curr = lst;
        int count = 0;

        while(curr != null){
            count++;
            curr = curr.getNext();
        }
        return count;
    }

}

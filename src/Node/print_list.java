package Node;

import unit4.collectionsLib.Node;

public class print_list { // Verified

    public static <T> void printList1(Node<T> lst) {
        for (Node<T> curr = lst; curr != null; curr = curr.getNext())
            System.out.print(curr + "  ");
        System.out.println();
    }

    public static <T> String printList2(Node<T> lst) {
        String str = "";
        Node<T> iter = lst;

        for (; iter.hasNext(); iter = iter.getNext())
            str += iter.getValue() + ", ";

        return "[" + str + iter.getValue() + "]";
    }

    public static <T> void printList3(Node<T> lst) {
        System.out.print("[");

        Node<T> iter = lst;
        for (; iter.hasNext(); iter = iter.getNext())
            System.out.print(iter.getValue() + ", ");

        System.out.print(iter.getValue() + "]\n");
    }
}

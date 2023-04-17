package BinNode;

import unit4.collectionsLib.BinNode;

public class tree_properties {

    public static int height(BinNode<Integer> node) {
        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = height(node.getLeft());
            int rDepth = height(node.getRight());

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static <T> int size(BinNode<T> tree) {
        if (tree == null)
            return 0;

        return 1 + size(tree.getLeft()) + size(tree.getRight());
    }

    public static boolean isLeaf(BinNode<Integer> bt1) {
        return bt1.getRight() == null && bt1.getLeft() == null;
    }

}

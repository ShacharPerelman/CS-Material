package BinNode;

import unit4.collectionsLib.BinNode;

public class search_tree {

    public static <T> String preorder(BinNode<T> tree) {
        if (tree == null)
            return "";

        else
            return tree.getValue() + " " + preorder(tree.getLeft()) + preorder(tree.getRight());
    }

    public static <T> String inorder(BinNode<T> tree) {
        if (tree == null)
            return "";

        else
            return inorder(tree.getLeft()) + " " + tree.getValue() + " " + inorder(tree.getRight());
    }

    public static <T> String postorder(BinNode<T> tree) {
        if (tree == null)
            return "";

        else
            return postorder(tree.getLeft()) + postorder(tree.getRight()) + " " + tree.getValue();
    }
}

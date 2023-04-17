package BinNode;

import unit4.collectionsLib.BinNode;

public class search_tree {

    public static int maxInTree(BinNode<Integer> bt1) {

        if (bt1 == null)
            return 0;
        int x = bt1.getValue();
        if(bt1.getLeft()!=null &&bt1.getRight()!=null)
            return Math.max(x, Math.max(maxInTree(bt1.getLeft()), maxInTree(bt1.getRight())));
        else if(bt1.getRight()!=null)
            return Math.max(x, maxInTree(bt1.getRight()));
        else if(bt1.getLeft()!=null)
            return Math.max(x, maxInTree(bt1.getLeft()));
        else
            return x;


    }

    public static int minInTree(BinNode<Integer> bt1) {

        if (bt1 == null)
            return 0;
        int x = bt1.getValue();
        if(bt1.getLeft()!=null &&bt1.getRight()!=null)
            return Math.min(x, Math.min(minInTree(bt1.getLeft()), minInTree(bt1.getRight())));
        else if(bt1.getRight()!=null)
            return Math.min(x, minInTree(bt1.getRight()));
        else if(bt1.getLeft()!=null)
            return Math.min(x, minInTree(bt1.getLeft()));
        else
            return x;


    }

    public static boolean find(BinNode<Character> bt1 , String str) {
        if (str.equals(""))
            return true;

        if ((bt1 == null) || (bt1.getValue() != str.charAt(0)))
            return false;

        return find(bt1.getRight(), slice(str)) || find(bt1.getLeft(), slice(str));
    }

    public static <T> boolean search(BinNode<T> tree, T x) {
        if (tree.getValue().equals(x))
            return true;

        return search(tree.getLeft(), x) || search(tree.getRight(), x);
    }

    private static String slice(String str) {
        return "";
    }

}

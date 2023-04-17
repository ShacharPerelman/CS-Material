package BinNode;

import unit4.collectionsLib.BinNode;

public class tree_counts {

    public static int numJunctions(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        return (1 + numJunctions(bt1.getLeft()) + numJunctions(bt1.getRight()));
    }

    public static int sumJunctions(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        return (bt1.getValue() + sumJunctions(bt1.getLeft()) + sumJunctions(bt1.getRight()));
    }

    public static int sumLeaves(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.hasLeft() || bt1.hasRight())
            return sumLeaves(bt1.getLeft()) + sumLeaves(bt1.getRight());
        else
            return bt1.getValue() + sumLeaves(bt1.getLeft()) + sumLeaves(bt1.getRight());
    }

    public static int numLeaves(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.hasLeft() || bt1.hasRight())
            return numLeaves(bt1.getLeft()) + numLeaves(bt1.getRight());
        else
            return 1 + numLeaves(bt1.getLeft()) + numLeaves(bt1.getRight());
    }

    public static int numOfRight(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.getRight() != null)
            return 1 + numOfRight(bt1.getLeft()) + numOfRight(bt1.getRight());
        else
            return numOfRight(bt1.getLeft()) + numOfRight(bt1.getRight());
    }

    public static int numOfLeft(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.getLeft() != null)
            return 1 + numOfLeft(bt1.getLeft()) + numOfLeft(bt1.getRight());
        else
            return numOfLeft(bt1.getLeft()) + numOfLeft(bt1.getRight());
    }

    public static int sumOfLeft(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.getLeft() != null)
            return bt1.getLeft().getValue() + sumOfLeft(bt1.getLeft()) + sumOfLeft(bt1.getRight());
        else
            return sumOfLeft(bt1.getLeft()) + sumOfLeft(bt1.getRight());
    }

    public static int sumPositive(BinNode<Integer> bt1) {
        if (bt1 == null) {
            return 0;
        }
        if (bt1.getValue() > 0) {
            return bt1.getValue() + sumPositive(bt1.getLeft()) + sumPositive(bt1.getRight());
        } else
            return sumPositive(bt1.getLeft()) + sumPositive(bt1.getRight());

    }

}

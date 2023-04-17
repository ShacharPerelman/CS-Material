package Stack;

import unit4.collectionsLib.Stack;

public class print_stack {

    public static <T> void print_stack(Stack<T> s) {
        Stack<T> copy = clone(s);
        while (!copy.isEmpty())
            System.out.println(copy.pop() + " ");
    }

    private static <T> Stack<T> clone(Stack<T> s) {
        return null;
    }
    
}

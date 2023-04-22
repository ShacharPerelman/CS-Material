package Stack;

import unit4.collectionsLib.Stack;

public class stack_size { // Verified

    public static <T> int size1(Stack<T> s) {
        Stack<T> copy = clone(s);
        int size = 0;
        while (!copy.isEmpty()) {
            size++;
            copy.pop();
        }
        return size;
    }

    public static <T> int size2(Stack<T> s) {
        int size = 0;
        for (Stack<T> copy = clone(s); !copy.isEmpty(); size++)
            copy.pop();
        return size;
    }

    private static <T> Stack<T> clone(Stack<T> s) {
        return s;
    }
    
}

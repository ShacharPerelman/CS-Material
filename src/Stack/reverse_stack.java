package Stack;

import unit4.collectionsLib.Stack;

public class reverse_stack {

    public static <T> Stack<T> reverse(Stack<T> s) {
        Stack<T> copy = new Stack<>();
        while (!s.isEmpty())
            copy.push(s.pop());

        return null;
    }



}

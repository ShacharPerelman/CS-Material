package Queue;

import unit4.collectionsLib.Queue;

public class reverse_queue {

    public static void reverse1(Queue<Integer> que) {
        if(!que.isEmpty()) {
            int x = que.remove();
            reverse1(que);
            que.insert(x);
        }
    }

    public static Queue<Integer> reverse2(Queue<Integer> q , Queue<Integer> q2){
        if(!q.isEmpty()){
            int x = q.remove();
            reverse2(q,q2);
            q2.insert(x);
        }
        return q2;
    }

    public static Queue<Integer> reverse2(Queue<Integer> q) {
        return reverse_queue.reverse2(clone(q),new Queue<>());
    }

    private static <T> Queue<T> clone(Queue<T> q) {
        return null;
    }

}

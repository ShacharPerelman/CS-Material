package Queue;

import unit4.collectionsLib.Queue;

public class clone_queue {

    public static <T> Queue<T> clone(Queue<T> q){
        Queue<T> newQ = new Queue<>();
        Queue<T> newQQ = new Queue<>();
        while(!q.isEmpty()){
            newQ.insert(q.head());
            newQQ.insert(q.remove());
        }
        while(!newQ.isEmpty())
            q.insert(newQ.remove());

        return newQQ;
    }

}

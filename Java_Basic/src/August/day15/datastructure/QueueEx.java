package August.day15.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<>();
        Queue<String> queue_str = new LinkedList<>();

        queue_int.add(1);
        queue_int.add(2);
        queue_int.add(3);
        queue_int.add(4);

        System.out.println(queue_int.offer(566));
        System.out.println(queue_int.peek());
        System.out.println(queue_int);
        queue_int.poll();
        System.out.println(queue_int);






    }
}

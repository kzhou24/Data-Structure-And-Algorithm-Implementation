package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class main {

    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(423);
        q.offer(5454);

        while(!q.isEmpty()){

            System.out.println(q.poll());
        }

    }
}

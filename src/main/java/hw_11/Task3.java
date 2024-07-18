package hw_11;

import java.util.LinkedList;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("red");
        queue.offer("black");
        queue.offer("white");
        queue.offer("orange");
        queue.offer("yellow");

        System.out.println(queue);

        String str = "";

        if (!queue.isEmpty())
            str = queue.element();
        else
            str = "Empty queue";

        System.out.println(str);
        System.out.println(queue);

        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        if (!queue.isEmpty())
            str = queue.remove();
        else
            str = "Empty queue";

        System.out.println(str);
        System.out.println(queue);

    }
}

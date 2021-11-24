package Sample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queuex {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Aditi"); // 0
        q.offer("Harshitha"); // 1
        q.offer("Ankita"); // 2
        q.offer("Pooja"); // 3

        q.poll();

        // q.stream().forEach(System.out::println);

        Iterator<String> it = q.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // q.forEach(System.out::println);


    }
}
package stack_and_queues.queue_using_stack;

public class Main {

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.peek());     // Output: 2
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.isEmpty());  // Output: false
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.isEmpty());  // Output: true
    }

}

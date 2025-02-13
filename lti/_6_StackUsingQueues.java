package lti;

import java.util.LinkedList;
import java.util.Queue;

public class _6_StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Constructor
    public _6_StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push operation (Add element to the stack)
    public void push(int x) {
        queue1.offer(x);
    }

    // Pop operation (Remove element from the stack)
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // The last element in queue1 is the top of the stack
        int top = queue1.poll();

        // Swap the names of the two queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Top operation (Get the top element of the stack)
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except the last one from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        // The last element in queue1 is the top of the stack
        int top = queue1.peek();

        // Move the element back to queue1
        queue2.offer(queue1.poll());

        // Swap the names of the two queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Empty operation (Check if the stack is empty)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        _6_StackUsingQueues stack = new _6_StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // 30
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Top element: " + stack.top()); // 20
        System.out.println("Popped element: " + stack.pop()); // 20
        System.out.println("Popped element: " + stack.pop()); // 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // true
    }
}


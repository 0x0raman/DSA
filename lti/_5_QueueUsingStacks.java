package lti;

import java.util.Stack;

public class _5_QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public _5_QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation (Add element to the queue)
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation (Remove element from the queue)
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 if stack2 is empty
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is empty after the transfer, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Pop the element from stack2 (this is the front of the queue)
        return stack2.pop();
    }

    // Peek operation (View front element without removing)
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        _5_QueueUsingStacks queue = new _5_QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peek()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("Dequeued: " + queue.dequeue()); // 30
        System.out.println("Is queue empty? " + queue.isEmpty()); // true
    }
}


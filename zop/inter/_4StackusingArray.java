package zop.inter;

class _4StackusingArray {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public _4StackusingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // Indicates that the stack is empty
    }

    // Push operation
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("_4StackusingArray Overflow");
            return;
        }
        arr[++top] = x; // Increment top and add element
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("_4StackusingArray Underflow");
            return -1; // Indicate empty stack
        }
        return arr[top--]; // Return top element and decrement
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("_4StackusingArray is empty");
            return -1;
        }
        return arr[top]; // Return top element
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        _4StackusingArray stack = new _4StackusingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Top element: " + stack.peek()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
package lti;

public class _3_stack {
    int maxSize, top;
    int[] stackArray;
    _3_stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == maxSize - 1;
    }
    void push(int value){
        if(isFull()){
            System.out.println("Stack is full, cannot push "+value);
        } else{
            stackArray[++top] = value;
            System.out.println("Pushed "+value+" to the stack.");
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop");
        } else{
            int popped = stackArray[top--];
            System.out.println("Popped "+popped+" value from the stack.");
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        } else{
            return stackArray[top];
        } 
    }
    int size(){
        return top + 1;
    }
    void printStack(){
        if(isEmpty()) System.out.println("Stack is Empty");
        else{
            for(int i = 0; i <= top; i++){
                System.out.print(stackArray[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        _3_stack stack = new _3_stack(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("peek: "+stack.peek());
        stack.pop();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();
        stack.pop();
    }
}

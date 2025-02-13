package lti;

public class _4_queue {
    int front;
    int rear;
    int maxSize;
    int[] queueArray;
    _4_queue(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }
    boolean isEmpty(){
        return front == -1;
    }
    boolean isFull(){
        return rear == maxSize - 1;
    }
    void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full. cannot enque "+value);
        } else{
            if(front == -1){
                front = 0;
            }
            queueArray[++rear] = value;
            System.out.println("Enqueued "+value);
        }
    }
    void dequeue(){
        if(isEmpty()) System.out.println("Queue is empty.");
        else{
            int dq = queueArray[front];
            if(front == rear) front = rear = -1;
            else front++;
            System.out.println("Dequeued "+dq+" from the queue.");
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        } 
        else{
            return queueArray[front];
        }
    }
    int size(){
        if(isEmpty()) return 0;
        else return rear - front + 1;
    }
    void printQueue(){
        if(isEmpty()) System.out.println("Queue is empty.");
        else{
            System.out.println("queue contents: ");
            for(int i = front; i <= rear; i++){
                System.out.print(queueArray[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _4_queue queue = new _4_queue(5);
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.printQueue();
        System.out.println("Front element is: "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        System.out.println("Front element after dequeues: "+queue.peek());
        System.out.println("Queue size: "+queue.size());
    }
}

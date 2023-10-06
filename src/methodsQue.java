public class methodsQue {

    int Queues[] = new int[6];

    int front, rear, size;

    public boolean isFull() {
        if (size == 6) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void getSize() {
        System.out.println("Size of the queue is: " + size);
    }
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            Queues[rear] = data;
            rear = rear + 1;
            size = size + 1;
        }
    }
    public void show() {
        System.out.print("Elements of the queue are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(Queues[front + i] + " ");
        }
        System.out.println();
    }
    public void peek() {
        System.out.println("First element of the queue is: " + Queues[front]);
    }
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            front = front + 1;
            size = size - 1;
        }
    }
    public static void main(String[] args) {
        methodsQue queue = new methodsQue();
        queue.deQueue();
    }
}

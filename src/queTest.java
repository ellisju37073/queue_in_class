public class queTest {

    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }

    }
    private Node head; // remove things here

    private Node tail; // add things here

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isFull()    {
        if(size() == 8)
        //want to use size() method to check if the queue is full
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int peek() {
        return head.data;
    }

    public void show() {
        Node current = head;
        while(current != null){
            System.out.println("Elements of the queue are: " + current.data);
            current = current.next;
        }
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            Node node = new Node(data);
            if(tail != null) {
                tail.next = node;
            }
            tail = node;
            if(head == null) {
                head = node;
            }
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            head = head.next;
            }

        }



    public static void main(String[] args) {
        queTest queue = new queTest();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.show();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.peek());
        queue.show();
        queue.dequeue();
        queue.show();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.show();

    }
}

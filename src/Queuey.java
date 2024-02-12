public class Queuey {

    Node front;
    Node rear;
    public static class Node {
        Node next;
        String value;
        Node (String Value) {
            this.value = value;
        }
    }
    public void enqueue(String value) {
        Node n = new Node(value);
        if (front == null) {
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n.next;
        }
        printQueuey();
    }
    public String dequeue() {
        String ret;
        ret = front.value;
        front = front.next;
        printQueuey();
        return ret;
    }
    public void printQueuey() {
        System.out.println("Queue: ");
        Node n = front;
        while (n != null) {
            System.out.println(n.value + " ");
            n = n.next;
        }
        System.out.println(" ");
    }
}

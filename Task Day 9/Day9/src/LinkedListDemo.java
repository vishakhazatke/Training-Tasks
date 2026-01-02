class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListDemo {
    private Node head, tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next; // Hopping through links
        }
        return (current != null) ? current.data : -1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.print("Current ");
        list.display();
        System.out.println("Data at index 1: " + list.get(1));

        list.removeFirst();
        System.out.print("After removeFirst: ");
        list.display();
    }
}

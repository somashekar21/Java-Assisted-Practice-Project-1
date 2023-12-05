package programs;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {

    private Node head;

    // Constructor to initialize an empty doubly linked list
    public DoublyLinkedList() {
        this.head = null;
    }

    // Function to insert a new element at the end of the doubly linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse the list to find the last node
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new node at the end
            last.next = newNode;
            newNode.prev = last;
        }
    }

    // Function to traverse the doubly linked list in the forward direction
    public void traverseForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to traverse the doubly linked list in the backward direction
    public void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Traverse to the end of the list
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Traverse backward from the last node
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        // Insert elements into the doubly linked list
        doublyList.insert(1);
        doublyList.insert(2);
        doublyList.insert(3);
        doublyList.insert(4);
        doublyList.insert(5);

        System.out.println("Doubly Linked List (Forward):");
        doublyList.traverseForward();

        System.out.println("Doubly Linked List (Backward):");
        doublyList.traverseBackward();
    }
}

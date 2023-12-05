package programs;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    private Node head;

    // Constructor to initialize an empty circular linked list
    public CircularLinkedList() {
        this.head = null;
    }

    // Function to insert a new element at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head and point it to itself
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            // Traverse the list to find the last node
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            // Insert the new node at the end
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Function to print the circular linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        // Insert elements into the circular linked list
        circularList.insert(1);
        circularList.insert(2);
        circularList.insert(3);
        circularList.insert(4);
        circularList.insert(5);

        System.out.println("Circular Linked List:");
        circularList.printList();
    }
}

package programs;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    // Constructor to initialize an empty linked list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Function to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to delete the first occurrence of a key in the linked list
    public void deleteKey(int key) {
        Node current = head;
        Node prev = null;

        // If the key is present at the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key was not found
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Insert some elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Original Linked List:");
        linkedList.printList();

        // Delete the first occurrence of a key (e.g., 3)
        int keyToDelete = 3;
        linkedList.deleteKey(keyToDelete);

        System.out.println("Linked List after deleting " + keyToDelete + ":");
        linkedList.printList();
    }
}


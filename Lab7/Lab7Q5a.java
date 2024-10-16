class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lab7Q5a {
    Node head;

    // Method to add a new node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Iterative method to print all nodes
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Lab7Q5a list = new Lab7Q5a();

        // Adding nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        // Printing all nodes
        list.printList(); // Output: 10 20 30 40
    }
}

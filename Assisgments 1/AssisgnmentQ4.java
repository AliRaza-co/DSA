 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public void add(int data) {
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

 
    public void reverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return; 
        }

        Node prev = null; 
        Node current = head; 
                Node next = null;  

        while (current != null) {
            next = current.next;   
            current.next = prev;   
            prev = current;        
            current = next;        
        }

        head = prev;  
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class AssisgnmentQ4{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

       
        System.out.println("Original List:");
        list.display();

       
        list.reverse();

        
        System.out.println("Reversed List:");
        list.display();
    }
}
    


class Node{
  String data;
  Node next;
  Node prev;

  Node(String data){
    this.data=data;
    this.next=null;
    this.prev=null;
  }

}

class doublyLinkedlist{
    Node Head;

    void insertAtBeg(String data){
        Node newNode=new Node(data);
       if (Head==null) {
        Head=newNode;
        return;
       }
       else{
        newNode.next=Head;
        Head.prev=newNode;
        Head=newNode;
       }
    }

    void insertAtBeg(Node node){
        if (Head==null) {
            Head=node;
        
        }
        else{
            node.next=Head;
            Head.prev=node;
            Head=node;
        }
    }

    void insertAtEnd(String data){
        Node newNode = new Node(data);
        if (Head==null) {
            Head=newNode;
        }
        else{
            Node n=Head;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=newNode;
            newNode.prev=n;
        }
    }


    void insertAtEnd(Node node){
 if (Head==null) {
    Head=node;
 }
     else{
        Node n=Head;
        while (n.next!=null) {
            n=n.next;
        }
        n.next=node;
        node.prev=n;
     }
    }

          public void insertAfterName(String name, Node node) {
                       Node current = Head;
                     while (current != null && !current.data.equals(name)) {
                    current = current.next;
                }
                if (current != null) {
                    node.prev = current;
                    node.next = current.next;    
                    if (current.next != null) {
                        current.next.prev = node;
                    }
                            current.next = node;
                } else {
                    System.out.println("Node with name '" + name + "' not found.");
                }
            }

            public void insertBeforeName(String name, Node node) {
                // If the list is empty, we can't insert before any node
                if (Head == null) {
                    System.out.println("List is empty, cannot insert before " + name);
                    return;
                }
                Node current = Head;
    
                while (current != null && !current.data.equals(name)) {
                    current = current.next;
                }
    
                if (current != null) {
                    if (current == Head) {
                        node.next = Head;
                        node.prev = null;
                        Head.prev = node;
                        Head = node;
                    } else {
                        
                        node.next = current;  
                        node.prev = current;
                        current.prev.next = node;
                        current.prev = node;
                    }
                } else {
                    System.out.println("Node with name '" + name + "' not found.");
                }
            }
        
            void makeCircular(){
                if (Head==null || Head.next==null) {
                    return;
                }
                         Node temp = Head;
                         while(temp.next!=null){
                             temp = temp.next;
                         }
                         temp.next=Head;

                    }
         

    public void display(int limit) {
        Node temp = Head;
        int count =0;
        while (temp != null&&count<limit) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        System.out.println();
    }

    
}


public class Lab3Q1 {
public static void main(String[] args) {
    doublyLinkedlist Dll=new doublyLinkedlist();
    Node name=new Node("hello!");
    Node newNode =new Node("He");
    Node n1=new Node("yes");
    Node n2=new Node("dear!");





    Dll.insertAtBeg("Razaaaa a genius?");
    Dll.insertAtBeg(name);

    Dll.insertAtEnd("No...");
    Dll.insertAtEnd(newNode);
   Dll.insertAfterName("No...", n1);
   Dll.insertBeforeName("Razaaaa", n2);
  
   Dll.makeCircular();
   Dll.display(10); ;
    
}
    
}
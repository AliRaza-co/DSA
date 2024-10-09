class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class SLinkedlist{
     Node head;

      void Addback(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        else{
            Node n=head;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=newNode;
        }
      }

      public void createCycle() {
        if (head == null || head.next == null) {
            return; 
        }
        else{

        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head.next;  //2rd node.
    }
      }

    
    public boolean detectCycle(Node head) {
    
        Node slow = head;
        Node fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;   

           
            if (slow == fast) {
                return true;
                
            }
        }

        return false;
    }
    
      void print(){
        Node n=head;
        while (n.next!=null) {
            System.out.println(n.data+"->");
            n=n.next;
        }
        System.out.println(n.data+"-> nulls");
      }
}


public class Lab3Q3 {
public static void main(String[] args) {
    SLinkedlist Sll=new SLinkedlist();
    Sll.Addback(2);
    Sll.Addback(9);
    Sll.Addback(8);
    
    Sll.print();
    
    System.out.println("detect cycle ? \n"+Sll.detectCycle(Sll.head));
 System.out.println("after creating cycle method\n");
    Sll.createCycle();

    System.out.println("cycle exist? \n"+Sll.detectCycle(Sll.head));
}
    
}
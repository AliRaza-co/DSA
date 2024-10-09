class Node{
    int data;
    Node next;

     Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedlist{
    Node Head;
    void AddElement(int data){
        Node node=new Node(data);
        if (Head==null) 
            Head=node;
        else{
            Node n=Head;
            while(n.next!=null)
                n=n.next;
                n.next=node;
        }
    } 
    void print(){
     Node node = Head;
        while (node.next!=null) {
            System.out.println(node.data + " ");
            node=node.next;
     }       
     System.out.println(node.data+" ");
    }
    public int length(){
        int count=0;
        Node n=Head;
          while (n.next!=null) {
            count++;
            n=n.next;
          }
          return count;
    }
}

public class labEX3 {
public static void main(String[] args) {
    linkedlist l=new linkedlist();

    l.AddElement(56);
    l.AddElement(3);
    l.AddElement(8);
    l.AddElement(59);
    l.AddElement(22);
    l.AddElement(32);

    l.print();

    System.out.println("the length of linkledlist elements is =" +l.length());
}    
}

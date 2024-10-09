class Node{
    int data;
    Node next;

       Node(int data){
        this.data=data;
        this.next=null;
       }
}
class Linkedlist{

    Node Head;
    void Add(int data){
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
    void printList(){
     Node node = Head;
        while (node.next!=null) {
            System.out.println(node.data + " ");
            node=node.next;
     }       
     System.out.println(node.data+" ");
    }
    public boolean Search(int key){
        Node n=Head;
        while (n.next!=null) {
            if (n.data==key) {
                return true;
            }
            n=n.next;
        }
                return false;
    }
}
  public class labEX2
{
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.Add(8);
        ll.Add(4);
        ll.Add(43);
        ll.Add(99);
        ll.Add(45);
        ll.printList();

        int key1=43;
        int key2=88;

        if (ll.Search(key1)) {
            System.out.println(key1+ " found in the list");
        }
        else{
            System.out.println(key1+ " not in the list");
        }

        if (ll.Search(key2)) {
            System.out.println(key2+" found in the list");
        }
        else{
            System.out.println(key2+" not found in the list");
        }

    }


    
}
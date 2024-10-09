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



   public int nthNode(int n){

    if(Head==null){
        return -1;
    }

    Node first = Head;
    Node second = Head;


    for(int i=0;i<n;i++){
        if (first==null) {
            return -1;
        }
        first=first.next;
    }

    while (first!=null) {
        first=first.next;
        second=second.next;
    }
    return second.data;
   }


}


public class AssisgnmentQ1 {
public static void main(String[] args) {
    linkedlist l=new linkedlist();
    l.Add(45);
    l.Add(33);
    l.Add(87);
    l.Add(67);
    l.Add(32);
    l.Add(21);

    l.printList();

    int n=3;
    int result=l.nthNode(n);

    if (result==-1) {
        System.out.println("list is emplty or n is too large");
    }
    else{
        System.out.println("the"+n+"th node from the end is :"+result);
    }
}
    
}
public class ReversedLL {
      Node curr;
      Node prev;
      public static Node Add(Node head, int data)
      {
          Node n=new Node(data);
          if(head==null)
          {   
            head=n;         
          }
          else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
              temp.next=n;
             
          }
          return head;
      }
    public Node Reversed(Node head)
    {
        curr=head;
        prev=null;
        Node Next;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;

        }
           return prev;
    }
     void PrintList(Node head)
     {
        if(head==null)
        {
        System.out.println("Linked list is empty ");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
     }

    public static void main(String[] args) {
        Node head=null;
        ReversedLL R=new ReversedLL();
         head=Add(head, 1);
         head=Add(head, 2);
         head=Add(head, 3);
         head=Add(head, 4);
         head=Add(head, 5);
         System.out.println("Original Linked List is here ");
         R.PrintList(head);
         System.out.println();
         System.out.println("Reversed Linked list is here ");
         Node head1=R.Reversed(head);
         R.PrintList(head1);



    }
}

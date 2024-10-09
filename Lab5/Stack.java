public class Stack  {
    public static final String Top = null;
    Node1 head;
    public void push(char data)
    {
          Node1 n=new Node1(data);
            if(head==null)
            {
                head=n;
            }
            else{
                n.next=head;
                head=n;
            }
    }
    public char pop()
    {
        if(head==null)
        {
            
             
        }
        else{
            char k=head.data;
            head=head.next;
            
            return k;
        }
        return ' ';
     
    }
    public void Top()
    {
        if(head==null)
        {
            System.out.println("Stack is empty ");
    
        }
        else{
            char k=head.data;
            System.out.println("Top element is "+k);
        }
     
    }


}

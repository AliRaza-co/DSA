class Node
{
    int data; // integer data
    Node next; // pointer to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
};
class Stack_LL
{
    private Node top;
    Node head;
    public Stack_LL() {
        this.top = null;
    }
    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        Node new_node=new Node(x);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;


    }
// Utility function to check if  the stack is empty or not
 public boolean isEmpty()
 {
if(head==null){
return true;
}
return false;
 }
// // Utility function to return top element in a stack
 public int top()
 {
    if(head==null){
        return -1;
    }
    return head.data;
 }
// // Utility function to pop top element from the stack and
//check for Stack underflow
 public void pop() // remove at the beginning
 {
if(head==null){
    System.out.println(":list is empty:");
    return;
}
head.next=head;
 }
}
class StackImpl
{
    public static void main(String[] args)
    {
        Stack_LL stack = new Stack_LL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}


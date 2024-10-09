// A linked list node
class Node
{
 int data; // integer data
 Node next; // pointer to the next node
 public Node(int data)
 {
 // set the data in allocated node and return the node
 this.data = data;
 this.next = null;
 }
}
class Queue
{
 private static Node rear = null, front = null;
 // Utility function to remove front element from the queue
//and check for Queue Underflow
public static int dequeue() // delete at the beginning
{
   if (front==null) {
    System.out.println("queue is empty:");
    return -1;
   }
   System.out.println("removing " +front.data);
   int item =front.data;
   front=front.next;

   if (front==null) {
    rear=null;
   }
   
  
    return item;
}
// Utility function to add an item in the queue
public static void enqueue(int item) // insertion at the
//end
{
    Node newNode=new Node(item);
      if (front==null) {
        front=newNode;
        rear=newNode;   
      }
      rear.next=newNode;
      rear=newNode;
      System.out.println("inserted"+item);
}
public static int peek()
{
       return front.data;
}
public static boolean isEmpty()
{
     return (front==null);
}
}
class Lab4Q4 {
    public static void main(String[] args)
    {
    Queue q=new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    System.out.printf("Front element is " + q.peek());
    System.out.println("\n");
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    if (q.isEmpty()) {
    System.out.print("Queue is empty");
    } else {
    System.out.print("Queue is not empty");
}
}
}

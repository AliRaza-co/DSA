class Queue
{
 private int arr[];
 private int front;
 private int rear;
 private int capacity;
 private int count;
 // Constructor to initialize queue
 Queue(int size)
 {
 arr = new int[size];
 capacity = size;
 front = 0;
 rear = 0;
 count = 0;
 }
 // Utility function to remove front element from the queue
//and check for Queue Underflow
 public void dequeue()
 {
    if (isEmpty()) {
        System.out.println("queue is empty: unable to dequeue");
        return;
    }
    else{
             System.out.println("Removing "+arr[front]);

             front++;
             count--;
    }
        
}
 // Utility function to add an item to the queue and check
//for queue overflow
 public void enqueue(int item)
 {
    if (count==capacity) {
        System.out.println("queue overflow : unable to enqueue." +item);
    }
    else{
          arr[rear]=item;
          rear++;
          count++;

          System.out.println("inserted "+item);
    }

 }
 // Utility function to return front element in the queue and
//check for Queue Underflow
  public int peek()
 {
    if (isEmpty()) {
        System.out.println("queue underflow:");
        return -1;
    }
      return arr[front];
 }
 // Utility function to return the size of the queue
 public int size()
 {
      return count;
 }
 // Utility function to check if the queue is empty or not
 public Boolean isEmpty()
 {
    return(count==0);
        
    
 }
 // Utility function to check if the queue is empty or not
 public Boolean isFull()
 {
     return (count==capacity);
 }
}


class Lab4Q3{

// main function
public static void main (String[] args)
{
// create a queue of capacity 5
Queue q = new Queue(5);
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
System.out.println("Front element is: " + q.peek());
q.dequeue();
System.out.println("Front element is: " + q.peek());
System.out.println("Queue size is " + q.size());
q.dequeue();
 q.dequeue();
 if (q.isEmpty())
 System.out.println("Queue Is Empty");
 else
 System.out.println("Queue Is Not Empty");
 }
} 

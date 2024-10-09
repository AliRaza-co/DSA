class Node{
    int data;
    Node next;
     
    Node(int data){
        this.data = data;
    }
}

class linkedList{
    Node head;
    int size=0;


    void addToBack(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void DisplayList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    
    void sort(){
        if(head != null){
            Node temp = head;
         while(temp != null){
                Node curr = temp.next;
                Node mini = temp;
                while(curr != null){
                    if(curr.data < mini.data){
                        mini = curr;
                        curr = curr.next;
                    }
                    else{
                        curr = curr.next;
                    }
                }
                int val = mini.data;
                mini.data = temp.data;
                temp.data = val;
                temp = temp.next;
               // System.out.println("Max is : " + mini.data);
                
            }
        }
        else{
            System.out.println(" LIST_EMPTY");
        }
    }
      
    public static void main(String[] args){
        linkedList list = new linkedList();
      
      list.addToBack(9);
        list.addToBack(5);
        list.addToBack(3);
        list.addToBack(1);
        list.addToBack(0);

        
        System.out.println("before Sorting");
        list.DisplayList();
        System.out.println("\nAfter sorting ");
        list.sort();
        list.DisplayList();
    }
}
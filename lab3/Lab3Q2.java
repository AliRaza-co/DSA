class node{
    String data;
    node next;
    node prev;
    node( String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
 class Double {
    node head;
    node tail = head;

    public void add_first(String name) {
        node new_node = new node(name);
        if (head == null) {
            head = new_node;
            tail = new_node;
            return;
        }
        head.prev = new_node;
        new_node.next = head;
        head = new_node;
    }

    public void add_last(String name) {
        node new_node = new node(name);
        if (head == null) {
            head = new_node;
            tail = new_node;
            return;
        }
        tail.next=new_node;
        new_node.prev=tail;
        tail=new_node;
    }
    public void remove_last(){
        if(head==null){
            System.out.println(":List is empty:");
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public void remove_first(){
        if(head==null){
            System.out.println(":List is empty:");
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void print(){
        if(head==null){
            System.out.println(":List is empty:");
            return;
        }
        node curr_node=head;
        while(curr_node!=null){
            System.out.print(curr_node.data+"-->");
        curr_node=curr_node.next;
        }
        System.out.println("null");
    }
}
public class Lab3Q2 {
    public static void main(String[] args) {

        Double l1=new Double();
        l1.add_last("best");
        l1.add_last("The");
        l1.add_last("are");
        l1.add_last("you");
        l1.add_first("Hey!");
        l1.print();
        l1.remove_last();
        l1.remove_first();
       l1.print();
    }
}

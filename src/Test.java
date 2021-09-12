
public class Test <E>{

    Node head;
    int size =0 ;

 
    static class Node<E> {

        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    
    //Add user in LinkedList
    public void adddata(E data) {
        size++;
        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;

    }

    // Print All LinkedList data
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

        System.out.println();
    }
    
    public Node getList(){
        return head;
    }

    
    //Delete Data given postion
    public void deleteNode(int position) {
         size--;
     
        if (head == null)
            return;
 
    
        Node temp = head;
 
        
        if (position == 0)
        {
            head = temp.next;   
            return;
        }
 
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
 

        if (temp == null || temp.next == null)
            return;
 

        Node next = temp.next.next;
 
        temp.next = next;  
        
    }
    
    //get size in linkedlist
   public int getSize() {
        return size;
    }
   
   // get linkedlist empty or not
    public boolean isEmpty(){
    
        if (size > 0) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Test<User> us = new Test<User>();
        us.adddata(new User(1, "a", "sadsad", "dsdasd", "dsadasd"));
        us.adddata(new User(2, "s", "sadsad", "dsdasd", "dsadasd"));
        us.adddata(new User(3, "B", "sadsad", "dsdasd", "dsadasd"));
        us.adddata(new User(4, "C", "sadsad", "dsdasd", "dsadasd"));
        us.adddata(new User(5, "D", "sadsad", "dsdasd", "dsadasd"));

        us.printList();
        us.deleteNode(3);
        us.printList();
    }
    
}

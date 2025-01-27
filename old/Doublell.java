public class Doublell {
    public class Node{
        int data;
        Node next;
        Node prev;
    

    public Node(int data){
        this.data=data;
        this.next = null;
        this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //adding node at the starting 
    public void addb(int data){
        Node newnode =  new Node(data);
        size++;

        if(head == null){
            head = tail= newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head= newnode;

    }


    //adding at the end of the list
    public void addl(int data){
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }


    //removing the node at the starting position 
    public void removeb(){

        if (head == null){
            return;
        }

        int val = head.data;
        System.out.println(head.data + " removed from start");
        head.next.prev = null;
        size--;
        head = head.next;

        
        // head = head.next;
        // head.prev = null;
        // size--;
    }

    //removing node at the ending position

    public void removel(){
        if(head==null){
            return;
        }

        int val = tail.data;
        System.out.println(tail.data + " removed from end");
        tail.prev.next = null;
        size--;
        tail = tail.prev;
    }


    //reverse the list
    public void reversedll(){

        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }


    //search element 
    public int search(int key){
        Node temp = head;
        int i =0;

        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    //print
    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
        System.out.println("null");


    }




    public static void main(String[] args) {
        Doublell dll =  new Doublell();

        dll.addb(1);
        dll.addb(2);
        dll.addb(3);
        dll.addb(4);
        

        dll.print();
        // dll.search(3);
        System.out.println(dll.search(2));
        // dll.reversedll();
        // dll.print();
        // dll.removeb();
        // dll.removeb();

        // dll.addl(5);
        // dll.removel();
        // dll.removel();

        // dll.print();
        // System.out.println(size);

    }
}

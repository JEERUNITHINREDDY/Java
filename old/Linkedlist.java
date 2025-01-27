public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //adding at the starting
    public void addfirst(int data){
        Node newNode = new Node(data); 
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        } 
        newNode.next = head;
        head = newNode;
    }

    //adding at the end 
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    //adding at the index place
    public void addmid(int idx, int data){
        if(idx ==0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    //removing the first element 
    public int removefirst(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        // System.out.println("removed element " + val);
        return val;
    }


    //removing the last element 
    public int removelast(){
        if(size == 0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head =  tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        for(int i =0; i < size-2; i++){
            prev = prev.next;
        } 
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //search the element 
    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    //////////////reverse a ll
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }   


    //remove the nth node from the end 
    public void remove_nth_end(int n){
        int sz =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return ;
        }

        int i =1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind){
            prev = prev.next;
            i++; 
        }

        prev.next = prev.next.next;
        return ;
    }



    //finding the mid value in linkedlist
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    // checking the LL is palindrome or not  
    public boolean checkpalin(){
        if (head == null || head.next == null){
            return true;
        }
        Node midnode = findmid(head);
        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right!=null){
            if(left.data != right.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;

    }



    //detect a loop in ll
    public static boolean isloop(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }


    //detect and remove the loop
    public static void removecycle(){
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        slow = head;
        Node prev =null;

        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }




    //printing the data 
    public void printList() {
        Node currentNode = head;
        System.out.print("LinkedList: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        //  ll.addfirst(3);
        //  ll.addfirst(2);
        // ll.addlast(1);
        // ll.addmid(1, 10);
        // ll.addmid(2, 11);
        // ll.addlast(1);
        // ll.addlast(2);
        // ll.addlast(1);
        // ll.addlast(2);
        // ll.addlast(1);

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        

        if (isloop()){
            System.out.println("cycle");
        }else{
            System.out.println("non cycle");
        }

        removecycle();
        if (isloop()){
            System.out.println("cycle");
        }else{
            System.out.println("non cycle");
        }
        ll.printList();


        // System.out.println(ll.checkpalin());
        // ll.printList();
        // ll.reverse();
       

        // ll.remove_nth_end(4);
        // ll.printList();


    }
}

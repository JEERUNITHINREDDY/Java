//the code implementation of stacks using linkedlist..

public class StacksLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }

    }

    public static Node head = null;

    //check empty
    public static boolean isempty(){
    
        return head == null;
    }

    //push 
    public static void push(int data){
        Node newnode = new Node(data);

        if(isempty()){
            head = newnode;
            return;
        }

        newnode.next = head;
        head =newnode;
    }

    //pop
    public static int pop(){
        if(isempty()){
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    //peak
    public static int peek(){
        if(isempty()){
            return-1;
        }
        return head.data;
    }

    //push element at the bottom of the stack
    public static void pushatbottom(StacksLL stkl, int data){
        if(isempty()){
            push(data);
            return;
        } 
        int top = pop();
        pushatbottom(stkl, data);
        push(top);
    }


    //reverse the stack
    public static void reversestack(StacksLL stkl){
        if(isempty()){
            return;
        }

        int top = pop();
        reversestack(stkl);
        pushatbottom(stkl, top);
    }

    //print
    public static void print(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StacksLL stkl =new StacksLL();
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        print();

       // stkl.pop();

       //pushatbottom(stkl, 10);

       reversestack(stkl);

        print();

        
        //System.out.println("the peek element "+peek());



    }
}

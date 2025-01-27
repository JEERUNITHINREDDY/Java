import java.util.*;

public class QueueLL {

    // static class Node{
    // int data;
    // Node next;

    // Node (int data){
    // this.data=data;
    // this.next=null;
    // } 
    // } 

    // static Node head = null;
    // static Node tail = null;

    // public static boolean isEmpty(){
    // return head == null && tail == null;
    // }

    // //push
    // public static void add(int data){
    // Node newnode = new Node(data);
    // if(head==null){
    // head = tail = newnode;
    // return;
    // }
    // tail.next = newnode;
    // tail = newnode;

    // }

    // //pop
    // public static int remove(){
    // if(isEmpty()){
    // System.out.println("queue is empty");
    // return -1;
    // }
    // int val = head.data;
    // if(tail == head){
    // tail = head = null;
    // }else{
    // head = head.next;
    // }
    // return val;
    // }

    // //peek
    // public static int peek(){
    // if(isEmpty()){
    // System.out.println("queue is empty");
    // return -1;
    // }
    // return head.data;
    // }

    public static void main(String[] args) {
        // QueueLL q = new QueueLL();
        Queue<Integer> q = new LinkedList<>(); // by using java collactions

        q.add(1);
        q.add(2);
        q.add(3);
        // remove();

        q.add(4);
        q.remove();
        q.add(5);
        q.add(6);
        q.remove();
        q.add(7);
        q.add(8);

        // add(9);

        // remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

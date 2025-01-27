

public class CircularQueue {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    CircularQueue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front =-1;
    }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    public static boolean isfull(){
        return (rear+1)%size == front;
    }

    //add
    public static void add(int data){
        if(isfull()){
            System.out.println("queue is full ");
            return;
        }
        if(front ==-1){
            front = 0;
        }
        rear = (rear+1) %size;
        arr[rear] = data;

    }

    //pop
    public static int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int val = arr[front];
        
        if(rear == front){
            rear = front = -1;
        }else {
            front = (front+1) %size;
        }
        return val;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        add(1);
        add(2);
        add(3);
        pop();
        add(4);
        pop();
        add(5);
        add(6);
        add(7);
        add(8);

        while(!isEmpty()){
          System.out.println(peek());  
          pop();
        }
    }


}
public class stack_array {

    static int[] arr = new int[10];
    // static int n = arr.length;
    static int peek = -1;  

    public static boolean  isempty(){
        return peek == -1;
    }

    public static void add(int data){
        if(arr.length-1 == peek ){
            System.out.println("satck is full");
        }
        peek = peek + 1;
        arr[peek] = data;
        System.out.println(arr[peek]+" is added");
    }

    public static void pop(){
        if(peek==-1 ){
            System.out.println("satck is empty");
        }
        int data = arr[peek];
        peek = peek -1;
        System.out.println(data +" is removed");
    }

    public static void peekvalue(){
        if(peek == -1){
            System.out.println("stack is empty");
        }
        int data = arr[peek];
        System.out.println(data+" is the peekvalue");
    }
    public static void print(){
        for(int i=0; i<=peek; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        add(1);
        add(2);
        pop();
        add(3);
        add(4);
        peekvalue();
        pop();
        peekvalue();
        add(5);
        print();

    }



}

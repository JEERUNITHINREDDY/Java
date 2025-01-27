import java.util.*;

public  class Stacks {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean empty(){
            return list.size() ==0;
        } 

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(empty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top;
        }

        //peek
        public static int peek(){
            if(empty()){
                return -1;
            }
            return list.get(list.size() -1);
        }
    }

    public static void main(String[] args) {
        stack stk = new stack();

        stk.push(10);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.pop();
        
        

        System.out.println(stk.peek());


    }
    
}
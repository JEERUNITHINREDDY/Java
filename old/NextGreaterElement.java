//the next greatest number after that

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack <Integer> s = new Stack<>();

        int newgreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                newgreater[i] = -1;
            }
            else{
                newgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0; i<=newgreater.length; i++){
            System.out.println(newgreater[i]+ " ");
        }
        System.out.println();
    


    }
}

import java.util.*;

public class polish {
    public static void main(String[] args) {
        String str[] = {"2", "1", "+", "3", "*","3","*"};

        Stack<String> stack = new Stack<String>();
        String oprators = "+-*/";

        for (String s :str){
            if(!oprators.contains(s)){
                stack.push(s);
            }else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (s) {
                    case "+":
                        stack.push(String.valueOf(a+b));                        
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));                        
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));                        
                        break;
                    case "/":
                        stack.push(String.valueOf(b/a));                        
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        System.out.println(stack.pop());


    }
}

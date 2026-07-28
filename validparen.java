import java.util.Stack;
//did it;
public class validparen {
    public static void main(String[] args) {
        Stack<Character> stack= new Stack<>();
        boolean valid=true;
        String str="(())]";

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    valid=false;
                    break;}
                if(ch==')' && stack.peek()=='(') stack.pop();
                else if(ch==']' && stack.peek()=='[') stack.pop();
                else if(ch=='}' && stack.peek()=='{') stack.pop();
                else {
                    valid=false;
                    break;}
            }
        }
        
        if(stack.isEmpty() && valid) System.out.println("valid");
        else System.out.println("invalid");
    }
}

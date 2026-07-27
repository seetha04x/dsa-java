import java.util.Stack;
//did it
public class duplicateparen {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        boolean valid=true;
        String str="(((a+b))+(c+d))";
        int count=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count=0;

            if(!(ch==')')){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    valid=false;
                    break;
                }
                while (stack.peek()!='('){ 
                    stack.pop();
                    count++;}
                stack.pop();

                if(count==0){
                    valid=false;
                    break;
                }

            }
        }
         if(stack.isEmpty() && valid) System.out.println("valid");
        else System.out.println("invalid");
    }
}

import java.util.Stack;

public class decode {
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        int n= s.length();

        Stack<Integer> num=new Stack<>();
        Stack<String> stack=new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                int currNum=0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    currNum=currNum*10 +(s.charAt(i)-'0');
                    i++;
                }
                i--;
                num.push(currNum);
            }
            else if(ch==']'){
                StringBuilder elements=new StringBuilder();
                while(!stack.isEmpty()&&!stack.peek().equals("[") ){
                    elements.insert(0,stack.pop());
                }
                stack.pop();

                String combined="";
                int count=num.pop();
                for(int j=0;j<count;j++){
                    combined+=elements;
                }
                stack.push(combined);
            }
            else{
                stack.push(String.valueOf(ch));
            }
        }
        System.out.println(stack.peek());
    }
}

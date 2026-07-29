import java.util.Stack;

public class unix {
    public static void main(String[] args) {
        String path="/../c/b/./a/..";
        Stack<String> stack=new Stack<>();
        String[] parts=path.split("/");
        for(int i=0;i<parts.length;i++){
            if (parts[i].equals(".") ||parts[i].equals("" )) continue;
            else if(parts[i].equals("..")){ 
                if(!stack.isEmpty()) stack.pop();}
            else stack.push(parts[i]);
        }

        // for(String el:stack){
        //     System.out.print("/");
        //     System.out.print(el);
        // }

        StringBuilder result = new StringBuilder();
        for(String el:stack){
            result.append("/").append(el);
        }

        System.out.println(result.length() == 0 ? "/" : result.toString());
    }
}

//Process:

// "a" → push → stack = ["a"]

// "." → skip

// "b" → push → stack = ["a", "b"]

// ".." → pop → stack = ["a"]

// ".." → pop → stack = []

// "c" → push → stack = ["c"]

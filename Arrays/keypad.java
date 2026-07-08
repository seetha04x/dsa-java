import java.util.*;

class keypad{
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    public static void keyPad(String digits,int i, StringBuilder current,List<String> result){
        if(i==digits.length()){ 
            result.add(current.toString());
            return;
        }   
        // char ch=digits.charAt(i);
        String letters = KEYPAD[digits.charAt(i)-'0'];
        for( char ch :letters.toCharArray()){
            current.append(ch);
            keyPad(digits, i+1, current,result);
            current.deleteCharAt(current.length()-1);
        }

    }
    
    public static void main(String[] args) {
        String digits="23";
        StringBuilder current= new StringBuilder();
        List<String> result=new ArrayList<>();
        keyPad(digits,0,current,result);
        
        System.out.print(result);
    }
}
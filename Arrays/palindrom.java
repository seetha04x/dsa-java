package Arrays;

public class palindrom {
    class Solution {
    public boolean isPalindrome(String s) {
        char[] charArr=new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                charArr[j++]=Character.toLowerCase(ch);
            }else if(ch>='a'&&ch<='z'){
                charArr[j++]=ch;
            }
            else if(ch>='0' && ch<='9'){
                charArr[j++]=ch;
            }
        }
        //i did it
        for(int i=0;i<j;i++){
            if(charArr[i]!=charArr[j-i-1]) return false;
        }
        return true;
    }
}
}

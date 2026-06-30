package Arrays;

import java.util.HashSet;
import java.util.Set;

public class longestSub {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen= new HashSet<>(); 
        int left=0;
        int max=0;
        for(int right=0;right< s.length() ;right++){
            char ch=s.charAt(right);
            while(seen.contains(ch)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(ch);
            max=Math.max(max,right-left+1);
           
        }
        return max;
    }
    public int lengthOfLongestSubstring2(String s) {
        int left=0,max=0;
        int [] arr=new int[256];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            left=Math.max(left,arr[ch]);
            max=Math.max(max,right-left+1);
            arr[ch]=right+1;
        }
        return max;
    }
}


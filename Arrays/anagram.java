import java.util.HashMap;
import java.util.Map;

class anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> seen=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            seen.put(ch, seen.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            seen.put(ch, seen.getOrDefault(ch,0)-1);
        }
        for( int num:seen.values()){
            if (num!=0) return false;
        }
        return true;
    }
}
public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> seen=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            seen.put(ch, seen.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            seen.put(ch, seen.getOrDefault(ch,0)-1);
        }
        for( int num:seen.values()){
            if (num!=0) return false;
        }
        return true;
    }
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
        if (c != 0) return false;
    }
    return true;
}

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> seen=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(seen.containsKey(str)){
                seen.get(str).add(strs[i]);
            }else{
                List<String> newList= new ArrayList<>();
                newList.add(strs[i]);
                seen.put(str,newList);
            }
        }
        return new ArrayList<>(seen.values());
    }
}

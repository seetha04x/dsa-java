class Solution {
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
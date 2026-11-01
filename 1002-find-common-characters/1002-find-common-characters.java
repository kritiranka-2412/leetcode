class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<String>();
        HashMap<Character,Integer> map = new HashMap<>();
        
        String word = words[0];
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> temp = new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(char c : map.keySet()){
                map.put(c, Math.min(map.get(c), temp.getOrDefault(c,0)));
            }
        }
        for(char c : map.keySet()){
            for(int i=0;i<map.get(c);i++){
                ans.add(String.valueOf(c));
    }
}
return ans;
    }
}
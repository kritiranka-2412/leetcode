class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map2 = new HashMap<>(map);
            boolean possible = true;
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(map2.getOrDefault(ch,0)==0){
                    possible = false;
                    break;
                }
                map2.put(ch,map2.get(ch)-1);
            }
            if(possible){
                ans+=words[i].length();
            }


        }
        return ans;
    }
}
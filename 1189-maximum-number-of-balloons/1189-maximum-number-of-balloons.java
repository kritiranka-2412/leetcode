class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int ans = Math.min(
    Math.min(map.getOrDefault('b',0), map.getOrDefault('a',0)),Math.min(map.getOrDefault('l',0) / 2,Math.min(map.getOrDefault('o',0) / 2, map.getOrDefault('n',0))));
    return ans;
    }
}
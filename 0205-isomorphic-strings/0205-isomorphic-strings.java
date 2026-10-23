class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s_to_t = new HashMap<>();
        HashMap<Character, Character> t_to_s = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(s_to_t.containsKey(a) && s_to_t.get(a)!= b)
                return false;
            if(t_to_s.containsKey(b) && t_to_s.get(b)!=a)
                return false;
            s_to_t.put(a,b);
            t_to_s.put(b,a);
        }
        return true;
    }
}
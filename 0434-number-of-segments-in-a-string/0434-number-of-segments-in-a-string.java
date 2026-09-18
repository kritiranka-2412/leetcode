class Solution {
    public int countSegments(String s) {
        if(s.trim().equals(""))
        return 0;
        else{
        String[] str = s.trim().split(" +");
        return str.length;
        }
        
    }
}
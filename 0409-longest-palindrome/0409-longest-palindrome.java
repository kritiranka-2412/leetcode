class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch]++;
        }
        int ans = 0;
        boolean found = false;
        for(int i: freq){
            if(i%2==0){
                ans+=i;
            }
            else{
                ans+=i-1;
                if(!found){
                    ans++;
                    found = true;
                }
            }
        }
        return ans;
    }
}
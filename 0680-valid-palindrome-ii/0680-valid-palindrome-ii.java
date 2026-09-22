class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return (check(s,i+1,j) || check(s,i,j-1));
            }
            i++;j--;
           
        }
        return true;

    }
    boolean check(String st,int a,int b){
        while(a<b){
            if(st.charAt(a)!=st.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
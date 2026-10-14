class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        Paranthesis(0,0,n,"",ll);
        return ll;
    }
    public static void Paranthesis(int open, int close, int n, String ans, List<String> ll){
        if(open==n && close ==n){
            ll.add(ans);
            return;
        }
        if(close>open || open>n)
            return;
        Paranthesis(open+1, close, n, ans+"(" , ll);
        Paranthesis(open, close+1, n, ans+")", ll);
    }
}
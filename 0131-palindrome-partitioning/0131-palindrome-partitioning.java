class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<String>();
        Partition(s,ll,ans);
        return ans;
    }
    public static void Partition(String s,List<String> ll,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList(ll));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String ques = s.substring(0,cut);
            if(isPalindrome(ques)){
            ll.add(ques);
            Partition(s.substring(cut),ll,ans);
            ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int l =0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
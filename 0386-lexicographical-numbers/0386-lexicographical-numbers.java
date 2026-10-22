class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ll = new ArrayList<>();
        Print(ll,0,n);
        return ll;
    }
    public static void Print(List<Integer> ll, int curr, int n){
        if(curr>n){
            
            return;
        }
        if(curr!=0)
            ll.add(curr);
        int i=0;
        if(curr==0)
            i=1;
        for(;i<=9;i++){
            Print(ll,curr*10+i,n);
        }

    }
}
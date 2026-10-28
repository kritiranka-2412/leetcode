class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combination(candidates,target,0,ll,ans);
        return ans;
    }
    public static void Combination(int[] candidates,int target,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                ll.add(candidates[i]);
                Combination(candidates,target-candidates[i],i,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int [] num=new int[2];
        int a=0;
        for(int i:nums){

            if(map.get(i)==1){
                num[a++]=i;
            }
        }
        return num;
    }
}
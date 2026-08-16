class Solution {
    public int findLucky(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =-1;
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==num) {
               ans=Math.max(ans,num);
            }
        }
        return ans;

    }
}
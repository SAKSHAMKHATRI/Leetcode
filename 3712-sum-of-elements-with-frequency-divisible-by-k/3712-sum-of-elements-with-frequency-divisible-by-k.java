class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)%k==0){
                sum+=i;
                map.put(i,0);
            }
        }
        return sum;
    }
}
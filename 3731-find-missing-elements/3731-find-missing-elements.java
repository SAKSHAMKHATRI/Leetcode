class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = nums[0];
        int max=nums[0];
        for(int num : nums){
            set.add(num); // sare elements add
            min = Math.min(min,num);
            max = Math.max(max,num);
        }   
        for(int i= min;i<=max;i++){
            if(!set.contains(i)) arr.add(i);
        }
        return arr;
    }
}
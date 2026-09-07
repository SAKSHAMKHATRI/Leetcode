class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i : nums){
            if(set.contains(original)) original = 2*original;
        }
        return original;
    }
}
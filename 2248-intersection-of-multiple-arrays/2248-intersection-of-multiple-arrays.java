class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int num:nums[0]){
            set.add(num);
        }
        for(int i =1;i<nums.length;i++){
            HashSet<Integer>set2 = new HashSet<>();
            for(int num:nums[i]){
                set2.add(num);
            }
            set.retainAll(set2);
        }
        arr.addAll(set);
        Collections.sort(arr);
        return arr;
    }
}
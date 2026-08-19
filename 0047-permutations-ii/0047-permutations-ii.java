class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        helper(nums,new ArrayList<>(),visited,ans);
        return ans;
    }
    public void helper(int[] nums , ArrayList<Integer>temp , boolean[] visited, List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            if (i > 0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            visited[i]=true;
            temp.add(nums[i]);
            helper(nums,temp,visited,ans);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}
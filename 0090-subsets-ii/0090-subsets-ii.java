class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean [] visited = new boolean[nums.length];
        helper(nums,0,new ArrayList<>(),visited,ans);
        return ans;
    }
    public void helper(int[] nums, int index, ArrayList<Integer>arr, boolean[] visited, List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(arr));
        int i= index;
        while(i<nums.length){
            if(i > index && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if(!visited[i]){
                visited[i]=true;
                arr.add(nums[i]);
                helper(nums,i+1,arr,visited,ans);
                arr.remove(arr.size()-1);
                visited[i]=false;
            }
            i++;
        }

    }
}
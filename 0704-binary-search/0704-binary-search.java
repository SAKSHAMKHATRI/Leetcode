class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
    public int helper(int[]nums,int target,int start ,int end){
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return helper(nums,target,mid+1,end); //right side
        else return helper(nums,target,start,mid-1);// left side 
    }
}
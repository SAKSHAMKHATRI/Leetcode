class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[]arr = nums.clone();
        Arrays.sort(arr);
        int j = n-1;
        for(int i=1;i<nums.length;i+=2){
            nums[i] =arr[j--];
        }
        for(int i =0;i<nums.length;i+=2){
            nums[i]=arr[j--];
        }
    }
}
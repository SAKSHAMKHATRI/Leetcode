class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n =nums.length;
        int[] arr = new int[2*n];
        int k=0;
        for(int i =0;i<nums.length;i++){
            arr[k++] = nums[i];
        }
        for(int i = nums.length-1;i>=0;i--){
            arr[k++]=nums[i];
        }
        return arr;

    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer>arr = new ArrayList<>();
        ArrayList<Integer>arr1 = new ArrayList<>();
        int[] arr2 = new int[2 * n];
        int j=0;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }  
        for(int i=n;i<2*n;i++){
            arr1.add(nums[i]);
        }
        for(int i=0;i<n;i++){ 
            arr2[j++]=arr.get(i);
            arr2[j++]=arr1.get(i);
        }
        return arr2;
    }
}
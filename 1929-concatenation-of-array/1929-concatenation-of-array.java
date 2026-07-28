class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        for(int num:nums){
            arr1.add(num);
        }
        for(int num:arr){
            arr2.add(num);
        }
        for(int num:arr1){
            arr2.add(num);
        }
        int[] result = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            result[i]=arr2.get(i);
        }
        return result;




    }
}
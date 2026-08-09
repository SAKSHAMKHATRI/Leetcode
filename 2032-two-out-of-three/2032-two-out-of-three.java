class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        for(int num:nums1){
           set1.add(num);
        }
        for(int num:nums2){
           set2.add(num);
        }
          for(int num:nums3){
           set3.add(num);
        }
        HashSet<Integer> all = new HashSet<>();
        all.addAll(set1);
        all.addAll(set2);
        all.addAll(set3);
        ArrayList<Integer>arr1 = new ArrayList<>();
        for(int num:all){
           int count =0;
           if(set1.contains(num)) count++;
           if(set2.contains(num)) count++;
           if(set3.contains(num)) count++;
           if(count>=2){
            arr1.add(num);
           }
        }
        return arr1;
    }
}
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set = new HashSet<>();
        for(int num:candyType){
            set.add(num);
        }
        int n = candyType.length;
        return Math.min(set.size(),n/2);
    }
}
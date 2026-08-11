class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int count=0;
         HashSet<Character>set = new HashSet<>();
         for(char num:jewels.toCharArray()){
            set.add(num);
         }
         for(char num:stones.toCharArray()){
            if(set.contains(num)) count++;
         }
         return count;
    }
}
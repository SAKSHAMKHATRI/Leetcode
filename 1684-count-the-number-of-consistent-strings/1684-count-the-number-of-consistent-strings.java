class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character>set = new HashSet<>();
        for(char word:allowed.toCharArray()){
            set.add(word);
        }
        for(String word:words){
            boolean flag = true;
            for(char word1 :word.toCharArray()){
                if(!set.contains(word1)){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split("\\s+");
        String ans ="";
        for(String word:words){
            word=word.toLowerCase();
            if(word.length()>2){
                word = Character.toUpperCase(word.charAt(0))+word.substring(1);
            }
            ans+=word+" ";
        }
        return ans.trim();
    }
}
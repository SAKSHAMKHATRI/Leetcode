class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans = "";
        String ans1 ="";
        for(int i=0;i<word1.length;i++){
            ans+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            ans1+=word2[i];
        }
        if(ans.equals(ans1)) return true;
        return false;
    }
}
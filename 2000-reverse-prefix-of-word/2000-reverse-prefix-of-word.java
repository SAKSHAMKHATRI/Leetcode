class Solution {
    public String reversePrefix(String word, char ch) {
        String s = "";
        int index =-1;
        int j=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        for(int i = index;i>=0;i--){
            char x = word.charAt(i);
            s+=x;
        }

        for(int i=index+1;i<word.length();i++){
            char x = word.charAt(i);
            s+=x;
        }
        return s;

    }
}
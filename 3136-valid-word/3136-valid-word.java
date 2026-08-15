class Solution {
    public boolean isValid(String word) {
        char[] arr = word.toCharArray();
        if(arr.length<3) return false;
        boolean vowel = false;
        boolean consonant = false;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(arr[i]>='0' && arr[i]<='9') continue;
            if((arr[i]>='A' && arr[i]<='Z') || arr[i]>='a' && arr[i]<='z' ){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch=='I'||ch=='O'|| ch=='U'){
             vowel = true;
            }
            else consonant = true;
            }
            else{
                return false;
            }
        } 
        return vowel && consonant;
    }
}
    
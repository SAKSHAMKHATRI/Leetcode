class Solution {
    public boolean validPalindrome(String s) {
        int i =0, j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
            String s1 = s.substring(0,i) + s.substring(i+1);
            String s2 = s.substring(0,j)+s.substring(j+1);
            return palindrome(s1)||palindrome(s2);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean palindrome(String s){
        StringBuilder st = new StringBuilder(s);
        String x = st.reverse().toString();
        if(x.equals(s)){
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean isBalanced(String num) {
        int evensum = 0;
        int oddsum=0;
        int i=0;
        while(i<num.length()){
            int digit = num.charAt(i)-'0';
            if(i%2==0){
                evensum+=digit;
            }
            else oddsum+=digit;
            i++;
        }
        if(evensum==oddsum) return true;
        return false;
    }
}